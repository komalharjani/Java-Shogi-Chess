## Dobutsu Shogi (Japanese Animal Chess)
This program runs a 2-player game of Animal Chess in Java. 

## The Rules
The two players have four pieces each: an elephant, a lion, a giraffe, and a chick. Players take turns moving a single piece.
• A chick moves one space forwards.
• An elephant moves one space in any diagonal direction.
• A giraffe moves one space in any orthogonal direction (forward, backward, left or right).
• A lion moves one space in any direction, either orthogonal or diagonal (8 possibilities).

A player cannot move a piece onto one of their own pieces, but they may move onto one of their opponent’s pieces, in which case the opponent's piece is captured. The capturing player takes the piece into their hand, and on a future turn, instead of moving a piece, they may drop a captured piece, by placing it onto any empty space on the board as one of their own pieces. A player wins by capturing their opponent’s lion.
If a player moves a chick into the furthest row from them (the row their opponent’s lion starts on) then it promotes. After promoting, on future turns, it can move one space in six directions: any of the eight directions the lion can move in, apart from the two spaces diagonally behind it. In a real game, this is shown by flipping the piece over to show a picture of a rooster.

More information about the game is found here: https://en.wikipedia.org/wiki/D%C5%8Dbutsu_sh%C5%8Dgi

## Running the Files

The files can only be run with the available test files as the main source. This assignment does not have a GUI - it is intended to only cover the logic of the game. 

## Deployment
This program is currently not available to run in a browser. 

## Authors

* **Komal Harjani** - (https://github.com/komalharjani)
