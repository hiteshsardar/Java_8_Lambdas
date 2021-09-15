package Java_8_Lambdas.Chapter_7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerToUpper {

    public static List<String> allToUpperCase(List<String> words) {
        return words.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.<String>toList());
    }

    @Test
    public static void multipleWordsToUppercase() {
        List<String> input = Arrays.asList("a", "b", "hello");
        List<String> result = allToUpperCase(input);
        System.out.println(assertEquals(Arrays.asList("A", "B", "HELLO"), result));
    }

    private static boolean assertEquals(List<String> asList, List<String> result) {
        boolean check = true;
        for(int i = 0; i < asList.size(); i++){
            if(asList.get(i) != result.get(i))
            {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hitesh Sardar");
        words.add("Sardar Hitesh");

        System.out.println(allToUpperCase(words));
        multipleWordsToUppercase();
    }
}
