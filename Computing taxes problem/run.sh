!/bin/bash

# Navigate to the directory containing the Java source files
cd "D:\Projecte Java self\Assignment1\assignment1\src\main\java"

# Compile the Java program
javac eu/deic/oop/assignment1.java 

# Check if compilation was successful
if [ $? -eq 0 ]; then
    # If compilation was successful, execute the Java program
    java eu.deic.oop.assignment1.java
else
    # If compilation failed, print an error message
    echo "Compilation failed."
fi