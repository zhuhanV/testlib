import com.google.common.collect.Lists;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi");
        fruits.forEach(System.out::println);
        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);
    }
}
