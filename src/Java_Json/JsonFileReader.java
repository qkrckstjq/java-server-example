package Java_Json;

import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonFileReader {
    private String fileRoute;
    private String jsonText;
    private JSONParser parser = new JSONParser();

    public JsonFileReader (String fileRoute) {
        this.fileRoute = fileRoute;
    }
    public void setFileRoute (String fileRoute) {
        this.fileRoute = fileRoute;
    }
    public void readJsonFileToText () {
        try {
            Reader reader = new FileReader(this.fileRoute);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            String jsonData = stringBuilder.toString();
            System.out.println("Read JSON data:\n" + jsonData);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
