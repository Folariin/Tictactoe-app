##Tic Tac Toe Game

##Overview
Tic Tac Toe is a classic two-player game where players take turns marking a square in a 3x3 grid. The first player to align three of their marks (either "O" or "X") in a row, column, or diagonal wins the game.

##Features
Play against another player.
Reset the game with a "New Game" button.
Visual representation of the game board.
Displays the winner after a game concludes.

##Technologies Used
Java (AWT for GUI)
Object-Oriented Programming principles

##Getting Started
##Prerequisites
Java Development Kit (JDK) version 8 or higher.
An IDE or text editor for Java (e.g., NetBeans, IntelliJ IDEA, Eclipse).
Installation
Clone the repository:

bash
Copy code
cd TicTacToe
Compile the Java files:

bash
Copy code
javac *.java
Run the game:

bash
Copy code
java GameView

Usage
Click on any empty square to make your move.
The game alternates between Player 1 (O) and Player 2 (X).
Click the "New Game" button to reset the game after a win or to start a new game.
Game Logic
The game logic is separated into three classes:

GameModel: Manages the game state, handles moves, and determines the winner.
GameView: Represents the graphical user interface and handles user interactions.
GameController: Links the model and view, responding to user actions and updating the game state.

Contributing
Fork the repository.
Create a new branch:

bash
Copy code
git checkout -b feature/YourFeature
Make your changes and commit them:
bash
Copy code
git commit -m "Add your message here"

Push to the branch:
bash
Copy code
git push origin feature/YourFeature
Create a pull request.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgements
Special thanks to everyone who contributed to the development of this project.
