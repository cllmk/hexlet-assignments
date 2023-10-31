package exercise;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary){
        List<Map<String, String>> findingBooks = new ArrayList<>();
        for (Map<String, String> book : books) {
           if (book.keySet().containsAll(dictionary.keySet())) {
               if (book.values().containsAll(dictionary.values())) {
                   findingBooks.add(book);
               }
           }
        }
        return findingBooks;
    }
}
//END
