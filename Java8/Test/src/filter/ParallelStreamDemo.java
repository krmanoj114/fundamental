package filter;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


public class ParallelStreamDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Random random = new Random();
        int min = 10;
        int max = 100;
        List<String> authorList = Arrays.asList(
                "George Orwell",
                "Nick Bostrom"
                );
        //Populate list with random book objects
        for (int i = 0; i < 100000; i++) {
            books.add(new Book(
                    String.valueOf(i),
                    authorList.get(new Random().ints(1, 1, authorList.size()).findFirst().getAsInt()),
                    1900));
        }


        long startTimeSequential = System.currentTimeMillis();
        Map<String, List<Book>> booksByAuthorSequential = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));

        long endTimeSequential = System.currentTimeMillis();
        //System.out.println("time taken :"+endTimeSequential);
        System.out.printf("Total time for sequential process: %sms\n",  (endTimeSequential-startTimeSequential));

        long startTimeParallel1 = System.currentTimeMillis();
        ConcurrentMap<String, List<Book>> booksByAuthorParallel = books.parallelStream()
                .collect(Collectors.groupingByConcurrent(Book::getAuthor));
        long endTimeParallel1 = System.currentTimeMillis();
        System.out.printf("Total time for parallel process: %sms\n",  (endTimeParallel1-startTimeParallel1));

    }


}
