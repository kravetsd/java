import java.util.ArrayList;

public class Album {
    private String name;
    private Songlist songlist;

    public Album(String name) {
        this.songlist = new Songlist();
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public boolean addSong(Song song){
        if (findSong(song.getTitle())==null){
            this.songlist.addSong(song);
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for (int i=0; i<this.songlist.getSongs().size();i++){
            Song foundSong = this.songlist.getSongs().get(i);
            if (foundSong.getTitle().equals(title)){
                return foundSong;
            }
        }
        return null;
    }



    public class Songlist {
        private ArrayList<Song> songs;

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public Songlist() {
            this.songs = new ArrayList<Song>() ;
        }

        private boolean addSong(Song song) {
            String songTitle = song.getTitle();
            Song songToFind = findSong(songTitle);
            if (songToFind == null) {
//            System.out.println("Adding "+song.getTitle());
                this.songs.add(song);
//            System.out.println(song.getTitle() + " was added into " + this.name + " album.");
                return true;
            }
//        System.out.println("Song "+songTitle+ " was not added to "+this.name);
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
}
