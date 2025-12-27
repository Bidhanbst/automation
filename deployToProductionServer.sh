#!/bin/bash
set -e

# Check KUBE_CONFIG
if [ -z "$KUBE_CONFIG" ]; then
    echo "❌ KUBE_CONFIG is not set."
    exit 1
fi

# Base folder for manifests
BASE_DIR="./manifests"


# Apply manifests in priority order
PRIORITY=("configmaps" "databases" "rabbitmq" "frontend" "services" "backend" "ingress")

for folder in "${PRIORITY[@]}"; do
    MANIFEST_DIR="$BASE_DIR/$folder"
    NAMESPACE="${NAMESPACE}"

    if [ -d "$MANIFEST_DIR" ]; then
        echo "Applying $folder manifests to namespace $NAMESPACE..."
        kubectl --kubeconfig="$KUBE_CONFIG" apply -f "$MANIFEST_DIR" -n "$NAMESPACE"
        echo "✅ Applied $folder manifests."
    else
        echo "⚠️ Folder $MANIFEST_DIR does not exist. Skipping..."
    fi
done

echo "🎉 All prioritized manifests applied to their namespaces."
