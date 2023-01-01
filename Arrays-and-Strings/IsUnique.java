import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    public static boolean isUniqueWithLookup(String word) {
        Map<Character, Integer> lookup = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (lookup.containsKey(word.charAt(i))) {
                return false;
            }
            lookup.put(word.charAt(i), i);
        }
        return true;
    }

    /* private static boolean isUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    } */

    public static void main(String[] args) {
        String word = "abc";
        System.out.print(String.format("All unique characters in \"%s\" -> ", word));
        // System.out.println(isUnique(word)); // In O(n * log(n))
        System.out.println(isUniqueWithLookup(word)); // In O(n) amortized (low collisions)
    }
}
