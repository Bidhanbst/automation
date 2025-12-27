#!/bin/bash

# Output file
OUTPUT_FILE="sonar-project.properties"

# Remove file if it exists
rm -f "$OUTPUT_FILE"

# Declare key-value pairs (you can add as many as you like)
declare -A config
config=(
    ["sonar.projectKey"]="${PROJECT_KEY}"
    ["sonar.projectName"]="${PROJECT_NAME}"
)

# Write key=value pairs to file
for key in "${!config[@]}"; do
    echo "$key=${config[$key]}" >> "$OUTPUT_FILE"
done

echo "File '$OUTPUT_FILE' created with the following contents:"
cat "$OUTPUT_FILE"

