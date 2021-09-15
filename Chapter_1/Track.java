package Java_8_Lambdas.Chapter_1;

public class Track {
    String name;
    int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}

