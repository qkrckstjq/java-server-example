package Java_Json;

import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Queue;

public class JsonFileReader {
    private String fileRoute;
    private String jsonText;
    private JSONParser parser = new JSONParser();
    private LinkedList<Integer[]> queue = new LinkedList<>();
    public JsonFileReader (String fileRoute) {
        this.fileRoute = fileRoute;

    }
    public void setFileRoute (String fileRoute) {
        this.fileRoute = fileRoute;
    }
    public void readJsonFileToText () {
//        try {
//            Reader reader = new FileReader(this.fileRoute);
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            StringBuilder stringBuilder = new StringBuilder();
//            String line;
//
//            while ((line = bufferedReader.readLine()) != null) {
//                stringBuilder.append(line).append("\n");
//            }
//            String jsonData = stringBuilder.toString();
//            System.out.println("Read JSON data:\n" + jsonData);
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        try (Reader reader = new FileReader(this.fileRoute);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

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

//import java.util.LinkedList;
//
//class Solution {
//    public int solution(int[][] maps) {
//        int goalY = maps.length-1;
//        int goalX = maps[0].length-1;
//
//        int[] move1 = {-1,1,0,0};
//        int[] move2 = {0,0,-1,1};
//
//        LinkedList<Integer[]> queue = new LinkedList<>();
//        Integer[] startPoint = {0,0,1};
//        boolean[][] visit = new boolean[maps.length][maps[0].length];
//        queue.add(startPoint);
//
//
//        while(!queue.isEmpty()) {
//            Integer[] cur = queue.pop();
//            int curY = cur[0];
//            int curX = cur[1];
//            int steps = cur[2];
//            visit[curY][curX] = true;
//
//            if(curY == goalY && curX == goalX) {
//                return steps;
//            }
//
//            for(int i = 0; i < move1.length; i++) {
//                int nextY = curY+move1[i];
//                int nextX = curX+move2[i];
//                if(nextY >= 0 && nextX >= 0 &&
//                        nextY < maps.length && nextX < maps[0].length &&
//                        maps[nextY][nextX] == 1 && !visit[nextY][nextX]) {
//                    Integer[] temp = {nextY, nextX, steps+1};
//                    queue.add(temp);
//                }
//            }
//        }
//        return  -1;
//    }
//}
