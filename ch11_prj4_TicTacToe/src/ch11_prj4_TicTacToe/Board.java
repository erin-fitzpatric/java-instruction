package ch11_prj4_TicTacToe;

public class Board
{
	String[][] spaces;

	public Board() {
		super();
		this.spaces = new String[][] {{" ", " ", " "},
									  {" ", " ", " "},
									  {" ", " ", " "}};
	}

	public void printBoard() {
    	System.out.println("+---+---+---+");
        System.out.println("| " + spaces[0][0] + " | " + spaces[0][1] + " | " + spaces[0][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + spaces[1][0] + " | " + spaces[1][1] + " | " + spaces[1][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + spaces[2][0] + " | " + spaces[2][1] + " | " + spaces[2][2] + " |");
        System.out.println("+---+---+---+");
    }
    
    public boolean placeMove(String player, int row, int column) {
		if (spaces[row][column].equals("X") || spaces[row][column].equals("O")) {
            return false;
        }
		spaces[row][column] = player; 
		return true;
    }


    public boolean isGameOver() {
        for (int i = 0; i < 3; i++) {
            // 3 in a row
            if (spaces[i][0].equals(spaces[i][1]) && spaces[i][0].equals(spaces[i][2]) && !spaces[i][0].equals(" ")) {
                return true;
			}
			// 3 in a column
            if (spaces[0][i].equals(spaces[1][i]) && spaces[0][i].equals(spaces[2][i]) && !spaces[0][i].equals(" ")) {
                return true;
            }
		}
        
        // Diagonal \
        if (spaces[0][0].equals(spaces[1][1]) && spaces[0][0].equals(spaces[2][2]) && !spaces[0][0].equals(" ")) {
            return true;
		} 
		// Diagonal /
        if (spaces[0][2].equals(spaces[1][1]) && spaces[0][2].equals(spaces[2][0]) && !spaces[0][2].equals(" ")) {
            return true;
        }
        return false;	
    }
}

