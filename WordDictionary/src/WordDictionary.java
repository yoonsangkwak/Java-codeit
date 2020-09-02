import java.util.HashMap;

public class WordDictionary {
    private HashMap<String, String> words = new HashMap<>();

    public void addWord(String english, String korean) {
        words.put(english, korean);
    }

    public String find(String english) {
        String reWord = null;
        for (String key : words.keySet()) {
            if (english.toLowerCase().equals(key.toLowerCase())) {
                return words.get(key);
            }
        }
        return null;
    }
}
