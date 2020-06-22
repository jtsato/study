import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSplitter {
    
    // O(n) — Linear Time
    private static List<String> stringSplitter(String input) {
        if (input == null) {
            return null;
        }
        final String argument = input.trim();
        if (argument.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> result = new ArrayList<>();
        int start = 0;
        for (int index = 0; index < argument.length(); index++) {
            if (' ' == argument.charAt(index)) {
                result.add(argument.substring(start, index));
                start = index + 1;
            }
        }
        result.add(input.substring(start, argument.length()));
        return result;
    }

    public static void main(String[] args) {
        final List<String> phrase = stringSplitter("Controlling complexity is the essence of computer programming.");
        for (String word : phrase) {
            System.out.println(word);
        }
    }
}

