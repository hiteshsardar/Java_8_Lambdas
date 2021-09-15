package Java_8_Lambdas.Chapter_2;


interface Runnable {
    void run();
}

public class RunnableImpl {
    public static void main(String[] args) {

        Runnable noArguments = () -> System.out.println("Hello World");
        noArguments.run();
//        new Thread(noArguments).start();
    }
}
