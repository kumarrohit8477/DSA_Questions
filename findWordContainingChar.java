import java.util.List;
import java.util.ArrayList;

public class findWordContainingChar {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) { // check if char exists in the word
                result.add(i); // add index to result
            }
        }

        return result;
    }

    // Test the function
    public static void main(String[] args) {
        findWordContainingChar obj = new findWordContainingChar();
        String[] words = { "leet", "code", "chatgpt", "java" };
        char x = 'e';

        List<Integer> result = obj.findWordsContaining(words, x);
        System.out.println(result); // Output: [0, 1] (leet, code contain 'e')
    }
}
