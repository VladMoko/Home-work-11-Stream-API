package arraysNumbers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static final String[] numbers = {"1,2,0", "3,4"};

    public static void main(String[] args) {
        Numbers revers = new Numbers();
        System.out.println("revers.sortedNumbers() = " + revers.sortedNumbers());
    }

    public static List<String> getNumbers() {
        return Arrays.asList(Numbers.numbers);
    }

    public String sortedNumbers() {
        String sorted = getNumbers().stream()
                .map(element -> (List<String>) new ArrayList<>(Arrays.asList(element.replaceAll("\\D+", " ").split(" "))))
                .flatMap(Collection::stream)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(x -> x + "")
                .collect(Collectors.joining(", ", "\"", "\""));

        return sorted;
    }
}
