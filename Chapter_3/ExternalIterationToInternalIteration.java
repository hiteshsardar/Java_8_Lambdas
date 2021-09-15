package Java_8_Lambdas.Chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExternalIterationToInternalIteration {

    public static void main(String[] args) {
        ArrayList<String> allArtists = new ArrayList<>();
        allArtists.add("jkghjkhy");
        allArtists.add("London");
        allArtists.add("asdD");
        allArtists.add("London");
        allArtists.add("London");
        allArtists.add("London");

        int count1 = 0;
        Iterator<String> iterator = allArtists.iterator();
        while (iterator.hasNext()) {
            String artist = iterator.next();
            if (artist.equals("London")) {
                count1++;
            }
        }

        System.out.println("Counter1 : " + count1);
        long count2 = allArtists.stream()
                 .filter(artist -> artist.equals("London"))
                 .count();
//      System.out.println(allArtists.stream().filter(artist -> artist.equals("London")).count());
        System.out.println("Counter2 : " + count2);


        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println("Collected : " + collected);
        System.out.println(assertEquals(Arrays.asList("a", "b", "c"), collected));


        List<String> collected_1 = new ArrayList<>();
        for (String string : Arrays.asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected_1.add(uppercaseString);
        }
        System.out.println(assertEquals(Arrays.asList("A", "B", "HELLO"), collected_1));


        List<String> collected_2 = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(assertEquals(Arrays.asList("A", "B", "HELLO"), collected_2));

    }


    private static boolean assertEquals (List < String > asList, List < String > collected){
        if (asList.equals(collected))
            return true;
        return false;
    }

}
