# JavaFX-TicTacToe
A simple Tic-Tac-Toe game implemented using JavaFX, featuring a graphical user interface and a basic AI opponent.
* **Graphical User Interface (GUI):** A clean and user-friendly interface built with JavaFX.
* **Two-Player Gameplay:** Players take turns placing "X" and "O" on the game board.
* **Basic AI Opponent:** A simple AI opponent (player 2) that makes random moves.
* **Win Detection:** Automatically detects and announces the winner.
* **Game Information Alerts:** Displays game results and information using JavaFX alerts.
* **CSS Styling:** Uses an external CSS file (`style.css`) for UI styling.

## Prerequisites

* Java Development Kit (JDK) 8 or later
* JavaFX SDK (included in modern JDKs)
* An IDE such as IntelliJ IDEA, Eclipse, or NetBeans (optional but recommended)


## Project Structure
JavaFX-TicTacToe/  
├── build/   
│   └── classes/         // Contains compiled class files  
│       └── tictactoygame/  
│           └── TicTacToyGame.class  
├── dist/               // Contains the packaged application (JAR)  
│   └── TicTacToyGame.jar  
├── nbproject/          // NetBeans project files  
│   ├── private/  
│   │   └── private.properties  
│   ├── project.properties  
│   └── project.xml  
├── src/                // Source code directory  
│   └── tictactoygame/  
│       ├── TicTacToyGame.java  // Main application class  
│       └── style.css           // CSS file for styling  
├── README.md            // Project description and instructions  
├── build.xml            // Ant build script (for building the project)  
└── manifest.mf          // Manifest file for the JAR  
* `TicTacToyGame.java`: The main JavaFX application file.
* `style.css`: The CSS file for styling the game's UI.


## Code Explanation

* The `TicTacToyGame` class extends `javafx.application.Application` and overrides the `start()` method to set up the GUI.
* A `GridPane` is used to arrange the buttons in a 3x3 grid.
* Each button has an `setOnAction` event handler that calls the `playGame()` method.
* The `playGame()` method updates the button's text, adds the cell ID to the player's list, and calls `CheckerWinner()` and `Autoplayer()` methods.
* The `CheckerWinner()` method checks for winning combinations and displays an alert if a winner is found.
* The `Autoplayer()` method implements the basic AI opponent, which makes random moves.
