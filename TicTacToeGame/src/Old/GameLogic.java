package Old;

public class GameLogic {
    static StringBuilder availableInput = new StringBuilder("1 2 3 4 5 6 7 8 9");

    protected static boolean IsValidMove(String input) {
        while (availableInput.indexOf(input) < 0) {
            return false;
        }
        
        int placedPin = DisplayBoard.boardMapping[ Integer.parseInt(input)];
        if (DisplayBoard.generateBoard[placedPin] == 'x' || DisplayBoard.generateBoard[placedPin] == 'o') {
            return false;
        }
        
        return true;
    }

    protected static void MakeMove(String input, char player) {
		int placedPin = Integer.parseInt(input) - 1;
		DisplayBoard.setBoardInput(placedPin, player);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
