package Java_Json;

import java.util.Scanner;
import java.util.Stack;

public class JsonFileReaderTest {
    public static void main(String[] args) {
        String rlRoute = "src\\Data.json";
        JsonFileReader reader1 = new JsonFileReader(rlRoute);
        reader1.readJsonFileToText();
    }

}
