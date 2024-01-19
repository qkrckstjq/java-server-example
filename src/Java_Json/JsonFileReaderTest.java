package Java_Json;

public class JsonFileReaderTest {
    public static void main(String[] args) {
        String Route = "../Data.json";
        JsonFileReader reader = new JsonFileReader(Route);
        reader.readJsonFileToText();
    }
}
