package ch11_prj4_TicTacToe;


public class TicTacToeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe\n");

		Board b = new Board();
		b.printBoard();

		String player = "O";
		
		while (!b.isGameOver()) {

			//Swap the player.
			if (player.equalsIgnoreCase("X")) {
				player = "O";
			}
			else {
				player = "X";
			}

			//put the move on the board.
			do
			{
				System.out.println(player + "'s turn");
				int rowChoice = Console.getInt("Pick a row (1, 2, 3): ");
				int columnChoice = Console.getInt("Pick a column (1, 2, 3): ");
				System.out.println("\n");

				if (b.placeMove(player, rowChoice - 1, columnChoice - 1))
				{
					break;
				}
				else
				{
					System.out.println("Invalid row or column. That's already taken.");
				}
			} while (true);
			

			// print board
			b.printBoard();
		}
		System.out.println(player + " Wins!\n");
		System.out.println("Game Over!");
	}
}