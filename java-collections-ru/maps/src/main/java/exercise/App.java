package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<String, Integer>(sentenceArray.length, 0.99f);
        int count;
        for (int i = 0; i < sentenceArray.length; i++) {
            if (wordsCount.containsKey(sentenceArray[i])) {
                count = wordsCount.get(sentenceArray[i]) + 1;
                wordsCount.put(sentenceArray[i], count);
            } else {
                wordsCount.put(sentenceArray[i], 1);
            }
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> words) {
        Collection<String> collection = words.keySet();
        String result = "{\n";
        for (String key : collection) {
            result = result + "  " + key + ": " + words.get(key) + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
