package is.ru.tictactoe;

public class TicTacToe {
	private char[][] gameBoard;
	private char currentPlayer;

	public TicTacToe() {
		//Create a new array to hold the game board
		gameBoard = new char[3][3];
	}

	public int initialize(){
		//Initialize the boards with no player marks
		for(int i = 1; i < 3; i++){
			for(int j = 1; j < 3; j++){
				gameBoard[i][j] = " ";
			}
		}
		return 1;
	}	
}
