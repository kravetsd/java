import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Hold on",4.22);
        album.addSong("Holy man",4.3);
        album.addSong("The gypsy",5.6);
        album.addSong("High ball shooter",3.21);
        album.addSong("Stormbringer",6.23);

        albums.add(album);

        album = new Album("For those about the rock", "AC/DC");
        album.addSong("For those about the rock", 5.44);
//        album.addSong("I put the finger on you", 3.35);
//        album.addSong("Lets go", 3.43);
//        album.addSong("Inject the venom", 3.32);
//        album.addSong("Snowballed", 2.56);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(1).addToPlayList(1,playlist);
        albums.get(0).addToPlayList(2,playlist);


        play(playlist);

    }
    public static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size()==0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playimg: "+listIterator.next().toString());
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                            forward = true;
                        }
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing :"+listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    printlist(playlist);
            }
        }
    }

    public void printlist(LinkedList<Song> playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        System.out.println("===============================");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
        System.out.println("===============================");
    }
}
