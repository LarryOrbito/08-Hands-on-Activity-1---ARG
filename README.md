# Alarm Application

This project is a simple Java application that allows users to set an alarm for a specific time on a Monday. The application checks if the alarm time is in the future or if it has already passed.

## Features

- Set an alarm for a specific time in the format `HH:MM`.
- The application will inform you whether the alarm is set for later today or for tomorrow.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Usage
When prompted, enter the time for the alarm in the format HH:MM.
The application will display a message indicating whether the alarm is set for later today or for tomorrow.

## Code Structure
- **Alarm.java**: Interface defining the methods for setting and showing alarms.
- **Weekday.java**: Abstract class implementing the Alarm interface and providing the setAlarm method.
- **Monday.java**: Class extending Weekday, implementing the showAlarm method, and containing the main method to run the application.
