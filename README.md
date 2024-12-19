# Alarm Clock Application

## Overview
The Alarm Clock Application is a simple Java program that allows users to set an alarm for a specific time on a Monday. The application checks whether the alarm time is in the future or has already passed, providing appropriate feedback to the user.

## Features
- Set an alarm for a specific time.
- Determine if the alarm time is in the future or has already passed.
- User-friendly command-line interface for easy interaction.

## Components
The application consists of the following key components:

1. **Alarm Interface**: This interface defines the methods for setting and displaying the alarm.

2. **Weekday Abstract Class**: This class implements the `Alarm` interface and serves as a base for specific weekdays.

3. **Monday Class**: This class extends the `Weekday` class and implements the `showAlarm` method to provide specific functionality for Monday.

## Usage
1. **Compile the Java files**: Use a Java compiler to compile the program.
2. **Run the Monday class**: Execute the `Monday` class to start the application.
3. **Set the alarm**: Enter the desired alarm time in the format `HH:MM` (24-hour format).
4. **Receive feedback**: The program will inform you whether the alarm is set for a future time or if it is set for the next day.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- Basic understanding of Java and command-line operations.


## Notes
- Ensure that the input time is in the correct format (HH:MM) to avoid parsing errors.
- The application currently only supports setting alarms for Monday. Future enhancements could include support for other weekdays.

