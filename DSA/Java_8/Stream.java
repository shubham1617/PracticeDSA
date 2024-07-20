package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(20);
        // list.add(50);

        // List<Integer> collect = list.stream().filter(x -> x >
        // 15).collect(Collectors.toList());
        // collect.stream().forEach(x -> System.out.println(x));

        // List<Integer> list = Arrays.asList(10, 20, 10, 55, 66, 9, 8, 75, 3, 22);
        // Set<Integer> set = new HashSet<>();
        // list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x
        // -> System.out.println(x));
        // ;

        String str = "Welcome to code decode and code decode welcome you";
        List<String> asList = Arrays.asList(str.split(" "));
        asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
