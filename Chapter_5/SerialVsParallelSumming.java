package Java_8_Lambdas.Chapter_5;
import Java_8_Lambdas.Chapter_1.*;

import java.util.Arrays;
import java.util.List;


public class SerialVsParallelSumming {
    static List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
            new Track("Violets for Your Furs", 378),
            new Track("Time Was", 451));

    static List<Album> albums = Arrays.asList(new Album("Bakai", tracks, "jgsdf"),
            new Album("Violets for Your Furs", tracks, "kjeraf"),
            new Album("Time Was", tracks, "hjsdfa"));



    public static int serialArraySum() {
        return albums.stream()
                .flatMap(a -> a.getTracks().stream())
                .mapToInt(Track::getLength)
                .sum();
    }

    public static int parallelArraySum() {
        return albums.parallelStream()
                .flatMap(a -> a.getTracks().stream())
                .mapToInt(Track::getLength)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("SerialArraySum : " + serialArraySum());
        System.out.println("ParallelArraySum : " + parallelArraySum());

    }
}
