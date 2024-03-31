@echo off

cd "D:\Projecte Java self\assignment2\assignment2\src\main\java"
REM Compile the Java program
javac eu\deic\oop\assignment2.java

REM Check if compilation was successful
if %errorlevel% equ 0 (
    REM If compilation was successful, execute the Java program
    java eu\deic\oop\assignment2.java
) else (
    REM If compilation failed, print an error message
    echo Compilation failed.
)
