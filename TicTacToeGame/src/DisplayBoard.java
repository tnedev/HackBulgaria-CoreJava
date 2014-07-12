import java.io.IOException;


public class DisplayBoard {
    static char[] generateBoard = { '|', '1', '|', '2', '|', '3', '|', '\n', '|', '4', '|', '5', '|', '6', '|', '\n',
            '|', '7', '|', '8', '|', '9', '|' };
    static int[] boardMapping = { 1, 3, 5, 9, 11, 13, 17, 19, 21 };
    protected static void refreshBoard(char[] boardState) {
        for (int i = 0; i < boardMapping.length; i++) {
            generateBoard[boardMapping[i]] = boardState[i];
        }

        System.out.println(generateBoard);
    }

    public static void main(String[] args) throws IOException {

        char[] boardInput = { 'X', '2', '3', '4', '5', '6', '7', '8', '9' };
        this.boardInput = boardInput;
        String input = "11";
        while (!GameLogic.IsValidMove(input)) {
            input = PlayerInput.userPressed();
        }
        GameLogic.MakeMove(input, 'y');
        DisplayBoard.refreshBoard(boardInput);
    }

}