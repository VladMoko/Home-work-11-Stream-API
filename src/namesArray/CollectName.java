package namesArray;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectName {

    public static void main(String[] args) {
        CollectName cn = new CollectName();
        System.out.println("cn.filter() = " + cn.filter());
    }


    public List filter() {
        Stream<String> name = Stream.of("1. Viva", "2. Jack", "3. Steven", "4. Dmitro")
                .filter(names -> (Integer.parseInt(String.valueOf(names.charAt(0)))) % 2 != 0)
                .sorted();
        List<String> filterList = name.collect(Collectors.toList());

        return filterList;
    }
}