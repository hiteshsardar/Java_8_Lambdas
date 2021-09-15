package Java_8_Lambdas.Chapter_3;


import java.util.Arrays;
import java.util.stream.Stream;

interface BinaryOperator<T>{
    T apply(T x, T y);
}

public class ReduceExample {

    public static void main(String[] args) {
        int acc = 0;
        for (Integer element : Arrays.asList(1, 2, 3)) {
            acc = acc + element;
        }
        System.out.println("Check_1 : " + assertEquals(6, acc));


        BinaryOperator<Integer> accumulator = (acc1, element) -> acc1 + element;
        int count = accumulator.apply( accumulator.apply( accumulator.apply(0, 1), 2), 3);
        System.out.println("Value_2 : " + count);
        System.out.println("Check_2 : " + assertEquals(6, count));


//      Using Lambda Expression
        int count_1 = Stream.of(1, 2, 3) .reduce(0, (acc1, element) -> acc1 + element);
        System.out.println("Check_3 : " + assertEquals(6, count_1));
    }

    private static boolean assertEquals (int no1, int no2){
        if (no1 == no2)
            return true;
        return false;
    }
}
