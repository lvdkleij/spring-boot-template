#!/bin/bash
# Example pre-commit script

echo "Running Spotless Check..."
./gradlew spotlessCheck

# Exit with 0 to allow the commit, or with a non-zero status to prevent it