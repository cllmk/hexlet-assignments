package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] sentenceArray = sentence.trim().split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();
        if (sentence.isEmpty()) {
            return wordsCount;
        }
        int count;
        for (String s : sentenceArray) {
            if (wordsCount.containsKey(s)) {
                count = wordsCount.get(s) + 1;
                wordsCount.put(s, count);
            } else {
                wordsCount.put(s, 1);
            }
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> words) {
        Collection<String> collection = words.keySet();
        if (words.containsKey("") | words.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{");
        for (String key : collection) {
            result.append("\n").append("  ").append(key).append(": ").append(words.get(key));
        }
        result.append("\n}");
        return result.toString();
    }
}
//END
