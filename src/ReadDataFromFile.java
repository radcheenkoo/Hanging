import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

    public String readDataFromFile(String fileName) {
        File file = new File(fileName);
        StringBuilder data = new StringBuilder();

        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file)) {
                int a;
                while ((a = fileReader.read()) != -1){
                    data.append((char)a);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return data.toString();
    }

}
