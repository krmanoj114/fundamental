package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        //use of filter -Capture even list
        List<Integer> evenList = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        evenList.forEach(System.out::println);
        System.out.println("#############################################");

        //Use of map - Multiply each digit by 2
        List<Integer> multipledList = list.stream().map(integer -> integer*2).collect(Collectors.toList());
        multipledList.forEach(System.out::print);

        System.out.println("#############################################");

        //Capture the count of element
        Long count = list.stream().count();
        System.out.println("count = " + count);

        System.out.println("#############################################");
        //Capture the count of even element
        Long count1 = list.stream().filter(i -> i%2==0).count();
        System.out.println("count1 = " + count1);

        System.out.println("############################################# Default sorting order ");
        //Sort element natural sorting order
        List sortedDefault = list.stream().sorted().collect(Collectors.toList());
        sortedDefault.forEach(System.out::println);

        System.out.println("############################################# Revers sorting order");
        //Sort element descending order
        List sortedD = list.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
        sortedD.forEach(System.out::println);
        sortedD.forEach(s->System.out.println(s));

        System.out.println("############################################# find min value");
        //find min value
        int min = list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println("min = " + min);

        System.out.println("############################################# find max value");
        //find mmax value
        int max = list.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println("max = " + max);

        System.out.println("############################################# Stream.of() method");
        //Stream.of() method
        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);

        System.out.println("############################################# Stream.of() for double array");
        //Stream.of() method for double array
        Double[] d ={10.1,10.2,10.3,10.4, 10.5};
        Stream<Double> doubleStream = Stream.of(d);
        doubleStream.forEach(System.out::println);


    }
}
