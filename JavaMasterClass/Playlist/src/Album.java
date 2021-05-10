import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        this.songs = songs;
        this.name = name;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
