@echo off

cd "D:\Projecte Java self\Assignment3\assignment1\src\main\java"
REM Compile the Java program
javac eu\deic\oop\assignment1.java

REM Check if compilation was successful
if %errorlevel% equ 0 (
    REM If compilation was successful, execute the Java program
    java eu\deic\oop\assignment1.java
) else (
    REM If compilation failed, print an error message
    echo Compilation failed.
)
