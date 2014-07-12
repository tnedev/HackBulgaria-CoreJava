package Old;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PlayerInput {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder availableInput = new StringBuilder("1 2 3 4 5 6 7 8 9");

    protected static String userPressed() throws IOException {
        String keyPressed = in.readLine();
        return keyPressed;

    }

}
