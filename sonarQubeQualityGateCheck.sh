#!/bin/bash

# === Configuration ===
SONAR_HOST_URL="http://localhost:9005"      # Change to your SonarQube URL
PROJECT_KEY="$PROJECT_KEY"                     # Your project key
SONAR_TOKEN="$SONAR_TOKEN"              # Generate from SonarQube -> My Account -> Security
BRANCH="${BRANCH}"                               # Optional: branch name if you want specific branch

# === API Call ===
if [ -z "$BRANCH" ]; then
    API_URL="$SONAR_HOST_URL/api/qualitygates/project_status?projectKey=$PROJECT_KEY"
else
    API_URL="$SONAR_HOST_URL/api/qualitygates/project_status?projectKey=$PROJECT_KEY&branch=$BRANCH"
fi

RESPONSE=$(curl -s -u $SONAR_TOKEN: $API_URL)

# === Parse Quality Gate Status ===
STATUS=$(echo "$RESPONSE" | jq -r '.projectStatus.status')

if [ "$STATUS" == "OK" ]; then
    echo "✅ Quality Gate PASSED for project '$PROJECT_KEY' (branch: $BRANCH)"
    exit 0
else
    echo "❌ Quality Gate FAILED for project '$PROJECT_KEY' (branch: $BRANCH)"
    echo "Details: $RESPONSE"
    exit 1
fi

