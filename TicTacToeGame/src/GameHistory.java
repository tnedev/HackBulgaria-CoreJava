import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.EmptyStackException;
import java.util.Stack;

public class GameHistory {

    Stack<char[]> gameHistoryStack = new Stack<char[]>();
    Stack<char[]> gameUndoStack = new Stack<char[]>();
    private char[] saveError = new char[] { 'e' };

    public void addMove(char[] move) {
        gameHistoryStack.push(move);
        gameUndoStack.clear();
    }

    public char[] undo() {
        try {
            gameUndoStack.push(gameHistoryStack.peek());

            return gameHistoryStack.pop();
        } catch (EmptyStackException e) {
            return saveError;
        }
    }

    public char[] redo() {
        try {
            gameHistoryStack.push(gameUndoStack.pop());
            return gameHistoryStack.peek();
        } catch (EmptyStackException e) {
            return saveError;
        }

    }

    public void saveGame() throws IOException {
        java.util.Date date = new java.util.Date();
        String name = (new Timestamp(date.getTime())).toString();
        FileWriter fstream = new FileWriter(name + ".txt");
        PrintWriter out = new PrintWriter(fstream);
        Stack saveGameStack = gameHistoryStack;;

        while (saveGameStack.empty() == false) {
            out.println(saveGameStack.pop());
        }
        out.close();
    }

    public static void main(String[] args) throws IOException {
        GameHistory gameOne = new GameHistory();
        char[] move = new char[] { '1', '2', '3', '4', '5', '6' };
        char[] move2 = new char[] { '1', '2', '3', '4', '5', 'X' };
        gameOne.addMove(move);
        gameOne.addMove(move2);
        gameOne.addMove(move);
        gameOne.addMove(move2);

        System.out.println(gameOne.undo());
        System.out.println(gameOne.undo());
        System.out.println(gameOne.undo());
        System.out.println(gameOne.undo());
        System.out.println(gameOne.undo());
        System.out.println(gameOne.undo());
    }
}
