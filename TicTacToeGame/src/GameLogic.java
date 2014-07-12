

public class GameLogic {
    static StringBuilder availableInput = new StringBuilder("1 2 3 4 5 6 7 8 9");

    protected static boolean IsValidMove(String input) {
        while (availableInput.indexOf(input) < 0) {
            return false;
        }
        
		int placedPin = DisplayBoard.boardMapping[Integer.parseInt(input) - 1];
        if (DisplayBoard.generateBoard[placedPin] == 'x' || DisplayBoard.generateBoard[placedPin] == 'o') {
            return false;
        }
        
        return true;
    }

    protected static void MakeMove(String input, char player) {
		int placedPin = Integer.parseInt(input) - 1;
		DisplayBoard.setBoardInput(placedPin, player);
		DisplayBoard.freePlaces--;
	}

	protected static boolean HasTurn() {
		if (DisplayBoard.freePlaces == 0) {
			return false;
		}
		boolean mainDiagonal = true, oDiagonal = true;
		for (Integer i = 0; i < DisplayBoard.dimmesion; i++) {
			boolean row = true, col = true;
			for (Integer j = 0; j < DisplayBoard.dimmesion; j++) {
				if (DisplayBoard.boardInput[i * DisplayBoard.dimmesion] != DisplayBoard.boardInput[i
						* DisplayBoard.dimmesion + j]) {
					row = false;
				}

				if (DisplayBoard.boardInput[i] != DisplayBoard.boardInput[i
						+ j * DisplayBoard.dimmesion]) {
					col = false;
				}
			}
			if (row || col) {
				return false;
			}
			if (DisplayBoard.boardInput[0] != DisplayBoard.boardInput[i
					* DisplayBoard.dimmesion + i]) {
				mainDiagonal = false;
			}
			if (DisplayBoard.boardInput[2] != DisplayBoard.boardInput[2 + i
					* DisplayBoard.dimmesion - i]) {
				oDiagonal = false;
			}


		}
		if (mainDiagonal || oDiagonal) {
			return false;
		}
		return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
