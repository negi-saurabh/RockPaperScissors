The core project contains 6 files
1) Choices - ENUM. As all the choices are related to one another. Its better to create a ENUM.
2) Computer - This file gets computer's input in the game using java utility Random.
3) Constants - This  file takes care of all the constants in the project. Having all the constants in one file makes it easier to handle constants.
4) Options - This is an interface which is implemented by Computer and Player class. It has the method getChoice() which had to be implemented by both the child files.
5) Player - This file gets User's input in the game using Scanner.
6) RockPaperScissors - This is the main file of the project. It contains the main method which takes care of the number of times game can be played and also has the main logic of the game.


Unit Test file.
1) RockPaperScissorsTest - checks the main logic of the game.
2) ComputerTest - check that computer does not return null value