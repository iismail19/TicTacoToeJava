# TicTacToe
This application allows two people to play Tic-Tac-Toe on a single device
## Installation
this project is a Java Application. Please download any Java complier to use and pull code from Github.
## Features
### Two Player Game
- allows for two people to play on one device
###  New Game Option
- Allows pair to play as many game as one desires
## Requirements for TicTacToe
### Functional Requirements
- Gather and display user names: Allow for two players to play on a single device, with an aspect of the screen indicating whose turn it is()
- Display a proper board: Display a standard tic tac toe 3x3 board, that is initially empty and then saves the previous moves. This should be displayed in a GUI(X)
- Take turns letting the players move: Alternates between X and O player moves(X)
- Detect winner: After each move detect whether the move was a winning move (3 in a row). If there is a winner, display winner name and freeze moves()
- Detect draw: The game will freeze moves once the game reaches a stalemate, even before the entire board is filled()
- Allow for a new game: Allow for players to clear game board and restart moves(X)
- Quit: Allow for players to exit the game and for it to shut down correctly(X)
- Best of nth: Allow in menu to pick a best of 3, 5, 7 style of games, where two players would play multiple times against each other and final winner would have won a multiple of games (based on how many picked)()
- In multiple game scenarios, have the ability to switch who goes first in a series of games()
- Ability to play against the computer, which will read the game board and decide the best move for itself to win()
- Ability to run a tournament of six people against each other, using brackets so that the winner of each match-up play against each other until there is one winner()
- Ability for each player to pick whether they are X or O or have game decide it randomly()
### Nonfunctional Requirements
- Keep UI separate from game logic - ensure that the game is modularized, that the game logic is separate from the game logic()
- Have square states only be 'X', 'O', or empty(X)
## Technologies
Created using Java using java.awt library.
## Creators
This was created by Ismail Ismail, Christy Hammill, Megan O'Toole, and Elena Murphy for Honig's COMP 330 class.
