package Interview.rsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CaptureWordCount {
    public static void main(String[] args) {
        String s ="This is a test program. This is for interview purpose";
        String[] s1 = s.split(" ");
        List<String> list = Arrays.asList(s1);
        System.out.println("List:"+list);

        List<String> list1 = new ArrayList<>(Arrays.asList(s1));
        System.out.println("List1:"+list1);

        List<String> list2 = Arrays.stream(s1).collect(Collectors.toList());
        System.out.println("List2:"+list2);

        List<String> list3 = Arrays.stream(s1).collect(Collectors.toList());
        Map<Object, Long> collect = list3.stream().collect(Collectors.groupingBy(l -> l, Collectors.counting()));
        System.out.println("collect :" +collect);

        Map<String, Long> collect1 = Arrays.stream(s1)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(m -> m, Collectors.counting()));
        System.out.println("collect1:"+collect1);

        Map<String, Long> collect3 = List.of(s1).stream().collect(Collectors.groupingBy(s2 -> s2, Collectors.counting()));

        System.out.println("collect3  :"+collect3);

        List<String> collect2 = Stream.of(s1).collect(Collectors.toList());

        System.out.println("###"+collect2);




    }
}
