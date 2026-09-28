import java.util.List;
import java.util.Random;


public class WordChooser {

    public static String chooseWord(List<String> wordList){
        return wordList.get(new Random().nextInt(wordList.size()));
    }
}
