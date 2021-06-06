package fan.stu.javaadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = createDataDumy();
        filter7(list);
        filter8(list);
    }

    private static List<Integer> createDataDumy() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private static void filter7(List<Integer> list) {
        System.out.println("---------------Filter 7---------------");
        Stream<Integer> steam = list.stream().filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                // TODO Auto-generated method stub
                return t % 2 == 0;
            }
        });
        
        steam.forEach(e -> System.out.println(e));

        // stream has already been operated upon or closed
        // System.out.println(steam.count());
    }
    
    private static void filter8(List<Integer> list) {
        System.out.println("---------------Filter 8---------------");
        list.stream().filter(t -> (t % 2 == 1)).forEach(e -> System.out.println(e));;
    }
}
