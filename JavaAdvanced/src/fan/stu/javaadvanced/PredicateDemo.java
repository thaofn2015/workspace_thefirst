package fan.stu.javaadvanced;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.equals("predicate");
        System.out.println(predicate.test("predicate")); // true

        Predicate<String> andPredicate = predicate.and(s -> s.length() == 9);
        System.out.println(andPredicate.test("predicate")); // true

        Predicate<String> orPredicate = predicate.or(s -> s.length() == 9);
        System.out.println(orPredicate.test("111111111")); // true

        Predicate<String> negatePredicate = predicate.negate();
        System.out.println(negatePredicate.test("predicate")); // false

        Predicate<Integer> greaterThan10 = s -> s > 10;
        Predicate<Integer> lessThan20 = s -> s < 20;
        System.out.println(greaterThan10.and(lessThan20).test(15));

        BiPredicate<Integer, String> condition = (i, s) -> i > 2 && s.startsWith("J");
        System.out.println(condition.test(5, "Java"));

        // Su dung de filter tu list
    }
}
