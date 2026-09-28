import java.util.ArrayList;
import java.util.List;

public class StringParser {

    public List<String> parse(String words) {

        if (words.isEmpty()){
            System.err.println("Error: Empty String");
        }

        List<String> wordsList = new ArrayList<>();
        String[] wordsArr = words.split(" ");

        for (String word : wordsArr) {
            wordsList.add(word);
        }

        return wordsList;
    }
}
