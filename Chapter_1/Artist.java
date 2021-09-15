package Java_8_Lambdas.Chapter_1;

public class Artist {
    String name;
    String members;
    String origin;


    public Artist(String name, String members, String origin) {
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", members='" + members + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
