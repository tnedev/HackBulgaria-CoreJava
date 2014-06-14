import java.util.HashMap;
import java.util.Map;


public class TextTools {

    public void CountOccurencesOfWordsInText(String input) {
        String[] array = input.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
    }

}
