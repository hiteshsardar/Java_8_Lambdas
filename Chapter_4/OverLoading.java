package Java_8_Lambdas.Chapter_4;

public class OverLoading {

    private static void overloadedMethod(Object o) {
        System.out.print("Object");
    }

    private static void overloadedMethod(String s) {
        System.out.print("String");
    }

    public static void main(String[] args) {
        overloadedMethod("abc");
    }
}
