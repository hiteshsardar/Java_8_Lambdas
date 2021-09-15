package Java_8_Lambdas.Chapter_1;

import java.util.List;

public class Album {
    String name;
    List<Track> tracks;
    String musicians;

    public Album(String name, List<Track> tracks, String musicians) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public String getMusicians() {
        return musicians;
    }

    public void setMusicians(String musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return "Album_1{" +
                "name='" + name + '\'' +
                ", tracks='" + tracks + '\'' +
                ", musicians='" + musicians + '\'' +
                '}';
    }
}