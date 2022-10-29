package randomNumbers;

import java.util.stream.Stream;

public class RandomDigits {

    public static void main(String[] args) {
           RandomDigits rd = new RandomDigits();
           rd.numbers(0L,22L,(long)Math.pow(3,43))
                   .limit(10)
                   .peek(System.out::println)
                   .count();
    }

    public Stream<Long> numbers(long seed, long c, long m) {
        long a = 1233143552L;
        return Stream.iterate(seed, x -> ((a * x + c) % m));
    }
}
