#!/bin/bash

# Navigate to the directory containing the Java source files
cd "D:\Projecte Java self\assignment3\assignment3\src\main\java"

# Compile the Java program
javac eu/deic/oop/assignment3.java eu/deic/oop/Matrix.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    # If compilation was successful, execute the Java program
    java eu.deic.oop.assignment3
else
    # If compilation failed, print an error message
    echo "Compilation failed."
fi
