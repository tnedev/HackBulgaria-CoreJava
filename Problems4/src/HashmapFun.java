import java.util.Map;


public class HashmapFun {
    public String HashTableToString(Map<String, String> map) {
        String result = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result = result + entry.getKey() + ":" + entry.getValue() + ", ";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

}
