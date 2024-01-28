package Stream_Pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
public class ParalleStreamExample {
    //filter
    //map
    //flatMap
    //collection
    //reduce
    //sorted
    //distinct
    //limit
    //skip
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("apple", "banana", "orange", "pear");
        List<Integer> listInt = Arrays.asList(5,4,1,2,6,7,8,1,2);

        System.out.println("stream의 filter 메소드 이용");
        listStr.stream().filter(s -> s.startsWith("o")).forEach(System.out::println);

        System.out.println("stream의 map 메소드 이용");
        listStr.stream().map(s -> s.startsWith("a") ? "hi" : "bye").forEach(System.out::println);

        System.out.println("stream의 flatMap 메소드 이용");
        listStr.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c)).forEach(System.out::print);
        System.out.println();

        System.out.println("stream의 collection 메소드 이용");
        String newStr = listStr.stream().collect(Collectors.joining());
        System.out.println(newStr);

        System.out.println("stream의 reduce 메소드 이용");
        int sum = listInt.stream().reduce(1,(a, b) -> a * b);
        System.out.println(sum);

        System.out.println("stream의 sorted 메소드 이용");
        listInt.stream().sorted().forEach(System.out::print);
        System.out.println();

        System.out.println("stream의 distinct 메소드 이용");
        listInt.stream().distinct().forEach(System.out::print);
        System.out.println();

        System.out.println("stream의 limit 메소드 이용");
        listInt.stream().limit(3).forEach(System.out::print);
        System.out.println();

        System.out.println("stream의 skip 메소드 이용");
        listInt.stream().skip(3).forEach(System.out::print);
        System.out.println();

    }
}
