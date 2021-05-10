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

    public boolean addSong(Song song){
        String songTitle = song.getTitle();
        Song songToFind = findSong(songTitle);
        if ( songToFind != null) {
            this.songs.add(song);
            System.out.println(song.getTitle() + " was added into " + this.name + " playlist.");
            return true;
        }
        return false;
    }

    private Song findSong(String songName){
        for (int i=0; i<this.songs.size();i++){
            Song foundSong = this.songs.get(i);
            if (foundSong.getTitle().equals(songName)){
                return foundSong;
            }
        }
        return null;
    }
}
