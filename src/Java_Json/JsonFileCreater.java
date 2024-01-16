package Java_Json;

import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class  JsonFileCreater {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "박찬섭");
        obj.put("age", 23);

        JSONArray list = new JSONArray();
        list.add("message1");
        list.add("message2");
        list.add("message3");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("C:\\Users\\qkrckstjq\\Desktop\\backend\\java-server-example\\src\\Data.json")) {
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(obj);
    }
}
