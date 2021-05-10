import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;

    private static void showMenu(){
        System.out.println(" ---- MENU ---- \n"+
                           "1. Press to QUIT playlist.\n"+
                           "2. Press to SKIP FORWARD next song.\n"+
                           "3. Press to SKIP BACKWARD to a previous song.\n"+
                           "4. Press to REPLAY the current song.\n"+
                           "5. Press to LIST songs in the playlist.\n"+
                           "6. Press to show this MENU. ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        showMenu();

        while (!quit){
            System.out.print( "Please enter your choice: -> ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Exiting playlist...Bye!");
                    quit = true;
                    break;
                case 6:
                    showMenu();
                    break;
            }
        }
    }
}
