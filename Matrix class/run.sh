!/bin/bash

# Navigate to the directory containing the Java source files
cd "D:\Projecte Java self\assignment4\assignment4\src\main\java"

# Compile the Java program
javac eu/deic/oop/assignment4.java eu/deic/oop/Matrix.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    # If compilation was successful, execute the Java program
    java eu.deic.oop.Matrix.java eu.deic.oop.assignment4.java
else
    # If compilation failed, print an error message
    echo "Compilation failed."
fi