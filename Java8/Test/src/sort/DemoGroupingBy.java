package sort;

import java.util.*;
import java.util.stream.Collectors;

public class DemoGroupingBy {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        Map<String, List<Student>> groupMap = students.stream()
                .collect(Collectors.groupingBy(Student::getSubject));

        groupMap.entrySet().forEach(entry ->{
            System.out.println("Key = " + entry.getKey()+" Values = "+entry.getValue());
        });
        System.out.println("Other way to extract map ket value");
        groupMap.forEach((key, value) -> System.out.println("Key = " + key+" Values = "+ value));

        Map<String, List<String>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getCity,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println("Get student by city");
        collect.forEach((key, value) -> System.out.println("Key = " + key+" Values = "+ value));

        //Count by age
        Map<Integer, Long> countByAge = students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));

        System.out.println("Get student countByAge");
        countByAge.forEach((key, value) -> System.out.println("Key = " + key+" Values = "+ value));
        TreeMap<String, List<String>> nameByCity = students.stream()
                .collect(Collectors.groupingBy(Student::getCity,
                        TreeMap::new,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println("Get student nameByCity");
        nameByCity.forEach((key, value) -> System.out.println("Key = " + key+" Values = "+ value));

        Map<String, List<String>> nameByCity1 = students.stream()
                .collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(e->e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)->{
                    throw new AssertionError();
                }, LinkedHashMap::new));
        nameByCity1.forEach((key, value) -> System.out.println(key + "::" +value));

        //for loop
        for (Map.Entry<String, List<String>> entry:nameByCity1.entrySet()) {
            System.out.println(entry.getKey()+">>>>"+ entry.getValue());

        }

        //for loop
        for (String key:nameByCity1.keySet()) {
            System.out.println(key+">>>><<<<<<"+ nameByCity1.get(key));

        }
    }
}