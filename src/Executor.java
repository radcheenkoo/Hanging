import java.util.List;

public class Executor {

    public static void start(){

        ReadDataFromFile reader = new ReadDataFromFile();
        String data = reader.readDataFromFile("words");

        StringParser parser = new StringParser();
        List<String> words = parser.parse(data);
        Console console = new Console();

        while (true){

            console.print(WordChooser.chooseWord(words));

        }

    }

}
