FROM php:8.2-fpm

# Copy composer.lock and composer.json
COPY composer.lock composer.json /var/www/

# Set working directory
WORKDIR /var/www

# Install dependencies
RUN apt-get update && apt-get install -y \
    build-essential \
    libpng-dev \
    libjpeg62-turbo-dev \
    libfreetype6-dev \
    locales \
    zip \
    jpegoptim optipng pngquant gifsicle \
    vim \
    unzip \
    git \
    curl \
    libpq-dev \
    libonig-dev \
    libzip-dev \
    libwebp-dev \
    net-tools

# Clear cache
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

# Install extensions
RUN docker-php-ext-install pdo_pgsql mbstring zip exif pcntl
RUN docker-php-ext-configure gd --with-freetype --with-jpeg --with-webp
RUN docker-php-ext-install gd

# Install composer
RUN curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer

# Add user for laravel application
RUN groupadd -g 1000 www-admin
RUN useradd -u 1000 -ms /bin/bash -g www-admin www-admin

# Copy existing application directory contents
COPY --chown=www-admin:www-admin . /var/www

# Install Dependencies
RUN composer install

# Set permissions for storage directory
RUN chown -R www-admin:www-admin /var/www/storage
RUN chmod -R 775 /var/www/storage

# Change current user to www
USER www-admin

# Expose port 9000 and start php-fpm server
EXPOSE 9000

CMD ["php-fpm"]