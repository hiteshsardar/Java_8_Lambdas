package Java_8_Lambdas.Chapter_3;
import Java_8_Lambdas.Chapter_1.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));

        Track shortestTrack = tracks.stream() .min(Comparator.comparing(track -> track.getLength())) .get();

        System.out.println(shortestTrack);
        System.out.println(tracks.get(1));
        System.out.println(assertEquals(tracks.get(1), shortestTrack));
    }

    private static boolean assertEquals(Track track, Track shortestTrack) {
        if (track.getName().equals(shortestTrack.getName()) && track.getLength() == shortestTrack.getLength())
            return true;
        return false;
    }
}
