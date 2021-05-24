import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    public static ArrayList<Album> albums = new ArrayList<Album>();
    private static LinkedList<Song> playlist = new LinkedList<Song>();


    private static void showMenu(){
        System.out.println(" ---- MENU ---- \n"+
                           "1. Press to QUIT playlist.\n"+
                           "2. Press to SKIP FORWARD next song.\n"+
                           "3. Press to SKIP BACKWARD to a previous song.\n"+
                           "4. Press to REPLAY the current song.\n"+
                           "5. Press to LIST songs in the playlist.\n"+
                           "6. Press to show this MENU. \n"+
                           "7. Press to REMOVE the current song from the playlist.\n"+
                           "=================================");
    }

    private static boolean addSongToPlaylist(Song song){
        boolean inAlbum = false;
        for (int i = 0; i < Playlist.albums.size(); i++) {
            Album album = Playlist.albums.get(i);
            if (album.findSong(song.getTitle())!=null){
                inAlbum = true;
            }
        }
        if (inAlbum) {
            if (!songInPlaylist(song.getTitle())) {
                Playlist.playlist.add(song);
                return true;
            } else {
                System.out.println("Song "+song.getTitle()+" is already in your playlist");
            }
        } else {
            System.out.println("Song "+song.getTitle()+" is not in your albums. Can't add this song into your playlist.");
        }
        return false;
    }

    private static boolean songInPlaylist(String songTitle){
        for (int i = 0; i < Playlist.playlist.size() ; i++) {
            if (Playlist.playlist.get(i).getTitle().equals(songTitle)){
                return true;
            }
        }
        return false;
    }

    private static void listTracks(String currentTrackTitle){
        for (int i = 0; i < Playlist.playlist.size(); i++) {
            String message = "["+(i+1)+"] - "+Playlist.playlist.get(i).getTitle()+". Duration: "
                    +Playlist.playlist.get(i).getDuration()+".";
            if (currentTrackTitle.equals(Playlist.playlist.get(i).getTitle())){
                System.out.println(message);
            } else{
                System.out.println(message);
            }
        }
    }

    public static void main(String[] args) {

        // tracks from album 1
        Song Hit101 = new Song("Hit101", 3.15);
        Song Hit102 = new Song("Hit102", 4.15);
        Song Hit103 = new Song("Hit103", 5.15);
        Song Hit104 = new Song("Hit104", 2.15);

        // tracks from album 2
        Song Hit201 = new Song("Hit201", 3.25);
        Song Hit202 = new Song("Hit202", 4.25);
        Song Hit203 = new Song("Hit203", 5.25);
        Song Hit204 = new Song("Hit204", 2.25);

        // tracks from album 3
        Song Hit301 = new Song("Hit301", 3.35);
        Song Hit302 = new Song("Hit302", 4.35);
        Song Hit303 = new Song("Hit303", 5.35);
        Song Hit304 = new Song("Hit304", 2.35);

        // Adding new albums:
        Album album1 = new Album("album1");
        Album album2 = new Album("album2");
        Album album3 = new Album("album3");


        Playlist.albums.add(album1);
        Playlist.albums.add(album2);
        Playlist.albums.add(album3);


        //Adding songs into albums;
        album1.addSong(Hit101);
        album1.addSong(Hit102);
        album1.addSong(Hit103);

        album2.addSong(Hit201);
        album2.addSong(Hit202);
        album2.addSong(Hit203);

        album3.addSong(Hit301);
        album3.addSong(Hit302);
        album3.addSong(Hit303);

        addSongToPlaylist(Hit101);
        addSongToPlaylist(Hit204);
        addSongToPlaylist(Hit303);
        addSongToPlaylist(Hit101);
        addSongToPlaylist(Hit201);
        addSongToPlaylist(Hit202);
        addSongToPlaylist(Hit302);

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean skipForward = true;

        showMenu();
        ListIterator<Song> listIterator = Playlist.playlist.listIterator();

        if (Playlist.playlist.isEmpty()){
            System.out.println(" ~~~~~ Nothing to play. Playlist is empty. ~~~~~");
        } else {
            System.out.println(" ~~~~~ Now playing: "+listIterator.next().getTitle()+" ~~~~~");
        }

        while (!quit){
            System.out.print( "Please enter your choice: -> ");
            int choice = scanner.nextInt();


            switch (choice){
                case 1:
                    System.out.println("Exiting playlist...Bye!");
                    quit = true;
                    break;
                case 2:
                    if (!skipForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                            System.out.println(" ~~~~~ Now playing: "+listIterator.next().getTitle()+" ~~~~~");
                        } else {
                            System.out.println("You are at the end of the playlist.");
                            skipForward = false;
                            break;
                        }
                        skipForward = true;
                        break;
                    } else {
                        if (listIterator.hasNext()){
                            System.out.println(" ~~~~~ Now playing: "+listIterator.next().getTitle()+" ~~~~~");
                        } else {
                            System.out.println("You are at the end of the playlist.");
                            skipForward = false;
                        }
                        break;
                    }
                case 3:
                    if (!skipForward){
                        if (listIterator.hasPrevious()){
                            System.out.println(" ~~~~~ Now playing: "+listIterator.previous().getTitle()+" ~~~~~");
                        } else {
                            System.out.println("You are at the very beginning of the playlist.");
                            skipForward = true;
                        }
                        break;
                    } else {
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                            System.out.println(" ~~~~~ Now playing: "+listIterator.previous().getTitle()+" ~~~~~");
                        } else {
                            System.out.println("You are at the very beginning of the playlist.");
                            skipForward = true;
                            break;
                        }
                        skipForward = false;
                        break;
                    }
                case 4:
                    if (skipForward){
                        System.out.println(" ~~~~~ Now playing: "+listIterator.previous().getTitle()+" ~~~~~");
                        skipForward = false;
                    } else {
                        System.out.println(" ~~~~~ Now playing: "+listIterator.next().getTitle()+" ~~~~~");
                        skipForward = true;
                    }
                    break;
                case 5:
                    listIterator.next();
                    String currentTitile = listIterator.previous().getTitle();
                    listTracks(currentTitile);
                    break;
                case 6:
                    showMenu();
                    break;
                case 7:
                    if (playlist.size() >0) {
                        if (listIterator.hasPrevious()) {
                            System.out.println(" ~~~~~ Now playing: " + listIterator.previous().getTitle() + " ~~~~~");
                            System.out.println(" Removing track " + listIterator.next().getTitle() + " from playlist");
                        } else if (listIterator.hasNext()){
                            System.out.println(" ~~~~~ Now playing: " + listIterator.next().getTitle() + " ~~~~~");
                            System.out.println(" Removing track " + listIterator.previous().getTitle() + " from playlist");
                        }
                        listIterator.remove();
                    } else {
                        System.out.println("Playlist is empty");
                    }
                    break;
            }
        }
    }

}
