# Mathgame - Educational Math Game

[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)

> An engaging educational Android app designed to help children develop mental math skills through interactive gameplay.

##  App Overview

Mathgame is a fun and educational math game that transforms learning into an exciting adventure. Perfect for elementary school children, this app helps develop quick mental calculation skills through three different arithmetic operations: Addition, Subtraction, and Multiplication.

## UI of the App


##  Features

###  Game Modes
- **Addition Mode**: Practice adding two random numbers (0-99)
- **Subtraction Mode**: Master subtraction skills
- **Multiplication Mode**: Learn multiplication tables

###  Gamification Elements
- **Scoring System**: Earn points for correct answers (+10) and lose points for mistakes (-5)
- **Life System**: Start with 2 lives - challenge yourself to survive longer
- **Timer Challenge**: 30-second countdown timer adds excitement and urgency
- **Real-time Feedback**: Immediate response showing correct answers

###  Educational Benefits
- Improves mental math speed and accuracy
- Enhances problem-solving skills
- Teaches time management under pressure
- Builds confidence in mathematical abilities
- Makes learning fun and engaging

##  Technical Details

### Built With
- **Language**: Java
- **Platform**: Android
- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 31 (Android 12)
- **Build Tool**: Gradle

### Architecture
- **Activities**: MainActivity, game, game2, game3, result
- **Layouts**: XML-based UI with custom drawables
- **Timer**: CountDownTimer for game mechanics
- **Random Generation**: Java Random class for question generation


##  Installation

### Prerequisites
- Android Studio (latest version recommended)
- Android SDK (API 21 or higher)
- Java Development Kit (JDK 8 or higher)


##  How to Play

1. **Launch the App**: Open Brain_Child on your Android device
2. **Choose Operation**: Select from Addition, Subtraction, or Multiplication
3. **Read the Question**: Look at the math problem displayed
4. **Enter Your Answer**: Type your answer in the input field
5. **Submit**: Tap "OK" to check your answer
6. **Continue**: Tap "Next" to move to the next question
7. **Track Progress**: Monitor your score, lives, and remaining time
8. **Game Over**: When you run out of lives or time, view your final score

### Scoring System
-  **Correct Answer**: +10 points
-  **Wrong Answer**: -5 points, lose 1 life
-  **Time's Up**: Lose 1 life
-  **Goal**: Achieve the highest score possible!

## 🏗 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/brain_child/
│   │   │   ├── MainActivity.java      # Main menu and navigation
│   │   │   ├── game.java             # Addition game logic
│   │   │   ├── game2.java            # Subtraction game logic
│   │   │   ├── game3.java            # Multiplication game logic
│   │   │   └── result.java           # Results display
│   │   ├── res/
│   │   │   ├── layout/               # UI layouts
│   │   │   ├── drawable/             # Images and graphics
│   │   │   └── values/               # Strings, colors, themes
│   │   └── AndroidManifest.xml       # App configuration
│   └── test/                         # Unit tests
└── build.gradle.kts                  # Build configuration
```

