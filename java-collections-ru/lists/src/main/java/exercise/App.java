package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String characterSet, String word){
        ArrayList<String> charSet = new ArrayList<String>(Arrays.asList(characterSet.split("")));
        ArrayList<String> charSetWord = new ArrayList<String>(Arrays.asList(word.split("")));
        int tempSize = charSet.size();
        for (int i = 0; i < charSetWord.size(); i++) {
            charSet.remove(charSetWord.get(i));
        }
        if (charSet.size() + charSetWord.size() == tempSize){
            return true;
        } else {
            return false;
        }
    }
//END
