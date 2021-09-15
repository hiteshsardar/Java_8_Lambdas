package Java_8_Lambdas.Chapter_3;

import Java_8_Lambdas.Chapter_1.Album;
import Java_8_Lambdas.Chapter_1.Track;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingTogether {
    static List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
            new Track("Violets for Your Furs", 378),
            new Track("Time Was", 451));

    static List<Album> albums = Arrays.asList(new Album("Bakai", tracks, "jgsdf"),
            new Album("Violets for Your Furs", tracks, "kjeraf"),
            new Album("Time Was", tracks, "hjsdfa"));

    public static void main(String[] args) {

//        Set<String> origins = albums.getMusicians() .filter(artist -> artist.getName().startsWith("The"))
//                .map(artist -> artist.getNationality())
//                .collect(Collectors.toSet());
    }
}
