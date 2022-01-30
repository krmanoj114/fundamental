package filter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoFilter {
    public static void main(String[] args) {
        List<String> list = List.of("yearly", "years", "yeast", "yellow", "blues", "astra");

        List filteredList = list.stream()
                .filter(s -> s.length() == 5)
                .filter(s -> !s.startsWith("y"))
                .filter(s -> s.contains("str"))
                .collect(Collectors.toList());
        //System.out.println(filteredList);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        list.stream()
                .filter(s -> s.length() == 5)
                .filter(s -> !s.startsWith("y"))
                .filter(s -> s.contains("str"))
                .collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(9, 2, 2, 7, 6, 6, 5, 7);
        Map<Integer, Integer> map = list1.stream()
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

        map.forEach((key, value)-> System.out.println(key +"::"+value));

        List<Map.Entry<Integer, Integer>> collect = list1.stream()
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toList());
       // System.out.println(">>>>>>");
        collect.forEach(e -> System.out.println(e.getKey()+"::"+e.getValue()));


    }





}