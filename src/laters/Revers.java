package laters;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Revers {
    public static void main(String[] args) {
        Revers revers = new Revers();
        System.out.println("revers.later() = " + revers.later());
    }

    public List later() {
        Stream<String> later = Stream.of("a", "b", "c", "d")
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder());
        List<String> reversLater = later.collect(Collectors.toList());

        return reversLater;
    }
}
