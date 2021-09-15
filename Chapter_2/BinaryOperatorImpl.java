package Java_8_Lambdas.Chapter_2;

interface BinaryOperator<T>{
    public T add (T x, T y);
}

public class BinaryOperatorImpl {
    public static void main(String[] args) {

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
        System.out.println(addExplicit.add(100l, 200l));

    }
}
