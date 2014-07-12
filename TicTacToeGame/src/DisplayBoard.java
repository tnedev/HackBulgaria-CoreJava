
import java.io.IOException;


public class DisplayBoard {

	protected static Integer dimmesion = 3;
	static Integer freePlaces = 9;
    static char[] generateBoard = { '|', '1', '|', '2', '|', '3', '|', '\n', '|', '4', '|', '5', '|', '6', '|', '\n',
            '|', '7', '|', '8', '|', '9', '|' };

	static char[] boardInput = { '1', '2', '3', 'X', 'X', '6', 'X', 'X', '9' };

	static void setBoardInput(Integer x, char ch) {
		boardInput[x] = ch;
	}

    static int[] boardMapping = { 1, 3, 5, 9, 11, 13, 17, 19, 21 };
    protected static void refreshBoard(char[] boardState) {
        for (int i = 0; i < boardMapping.length; i++) {
            generateBoard[boardMapping[i]] = boardState[i];
        }

        System.out.println(generateBoard);
    }

    public static void displayMsg(String message) {

        System.out.print("   " + message);

    }

    public static void main(String[] args) throws IOException {


        String input = "11";
        while (!GameLogic.IsValidMove(input)) {
            input = PlayerInput.userPressed();
        }
		GameLogic.MakeMove(input, 'X');
		DisplayBoard.refreshBoard(DisplayBoard.boardInput);
		boolean result = GameLogic.HasTurn();
		System.out.println(result);
    }

}
