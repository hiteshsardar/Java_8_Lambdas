package Java_8_Lambdas.Chapter_2;


interface Predicate_intf<T> {
    boolean test(T t);
}

public class Predicate {
    public static void main(String[] args) {
        Predicate_intf<Integer> check = x -> x > 5;
        System.out.println(check.test(20));
        System.out.println(check.test(2));
    }
}
