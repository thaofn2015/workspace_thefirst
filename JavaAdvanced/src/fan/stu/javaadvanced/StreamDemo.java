package fan.stu.javaadvanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        // countEvenNumber();

        // primitiveStream();

        // convertToStream();

        convertFromStream();
    }

    // tao stream sang cau tru du lieu khac
    private static void convertFromStream() {
        // Stream to Collection
        Stream<String> stream1 = Stream.of("Java", "C#", "PHP");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println(list);

        // Stream to array
        Stream<String> stream2 = Stream.of("Java", "C#", "PHP");
        String[] array = stream2.toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }

    // tao stream tu cac cau truc du lieu khac
    private static void convertToStream() {
        // Generate stream from array
        String[] languages = {"Java", "C#", "PHP"};
        Arrays.stream(languages).forEach(System.out::println);;
        Stream.of(languages).forEach(i -> System.out.println(i));

        // Generate stream from collections
        List<String> list = Arrays.asList("Java", "C#", "PHP");
        list.stream().forEach(System.out::println);

        // Generate stream su dụng Stream.genarate()
        Stream<String> stream = Stream.generate(() -> "thaopn").limit(3);
        String[] array = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        // Genarate stream from Stream.iterate
        Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
        iterateNumbers.forEach(System.out::print); // 12345

        // Generate Streams from APIs like Regex
        String str = "Welcome,to,gpcoder";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::println);// Welcometogpcoder
    }

    private static void countEvenNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        long count = numbers.stream().filter(number -> (number % 2 == 0)).count();

        System.out.println(count);
    }

    // tao stream cho nhung kieu primitive
    private static void primitiveStream() {
        IntStream.of(1, 10).forEach(i -> System.out.println(i));

        IntStream.range(1, 10).forEach(i -> System.out.println(i));

        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        DoubleStream.of(1, 2, 3).forEach(System.out::println);
 
        LongStream.range(1, 4).forEach(System.out::println);
 
        LongStream.of(1, 2, 3).forEach(System.out::println);
    }


    
}
