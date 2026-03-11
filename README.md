# Java AWT Calculator

## Overview
This project is a simple **Calculator application built using Java AWT (Abstract Window Toolkit)**.  
It performs basic arithmetic operations such as addition, subtraction, multiplication, and division using a graphical user interface (GUI).

The calculator allows users to input numbers by clicking buttons and displays results in a text field.

---

## Features
- Graphical User Interface using **Java AWT**
- Supports basic arithmetic operations:
  - Addition (+)
  - Subtraction (-)
  - Multiplication (x)
  - Division (/)
- Clear button to reset the calculator
- Button-based number input (0–9)
- Displays results instantly when the **=** button is pressed
- Window close functionality

---

## Technologies Used
- Java
- Java AWT
- Event Handling (ActionListener)

---

## Project Structure

Calculator.java
README.md


---

## How It Works
1. The calculator interface is built using:
   - `Frame`
   - `Panel`
   - `Button`
   - `TextField`
   - `GridLayout`

2. Each button is attached to an **ActionListener**.

3. When a button is clicked:
   - Number buttons append values to the display.
   - Operator buttons store the first number and operation.
   - The **equals (=)** button calculates the result.

---

## Installation and Running

### 1. Clone the repository

git clone https://github.com/your-username/java-calculator.git
2. Navigate to the project folder
cd java-calculator
3. Compile the program
javac Calculator.java
4. Run the program
java Calculator
Example Usage
Input: 7 + 3 =
Output: 10

Input: 9 - 4 =
Output: 5
Future Improvements

Possible enhancements for the project:

Add decimal number support

Improve UI design

Add keyboard input support

Handle divide-by-zero errors

Add scientific calculator functions

Convert the project to Java Swing or JavaFX

Author

## Phodzo Nagana 

License

This project is open-source and free to use for educational purposes.
