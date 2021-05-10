import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        this.songs = new ArrayList<Song>();
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
        if ( songToFind == null) {
//            System.out.println("Adding "+song.getTitle());
            this.songs.add(song);
//            System.out.println(song.getTitle() + " was added into " + this.name + " album.");
            return true;
        }
//        System.out.println("Song "+songTitle+ " was not added to "+this.name);
        return false;
    }

    public Song findSong(String songName){
        for (int i=0; i<this.songs.size();i++){
            Song foundSong = this.songs.get(i);
            if (foundSong.getTitle().equals(songName)){
                return foundSong;
            }
        }
        return null;
    }
}
