import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Moscow");
        addInOrder(placesToVisit,"London");
        addInOrder(placesToVisit,"St.Pet");
        addInOrder(placesToVisit,"Astana");
        addInOrder(placesToVisit,"Berlin");
        printlist(placesToVisit);

        addInOrder(placesToVisit,"Maikuduk");
        addInOrder(placesToVisit,"Berlin");
        printlist(placesToVisit);
        visit(placesToVisit);
    }

    public static void printlist(LinkedList<String> list) {
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("======================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> i = linkedList.listIterator();
        while (i.hasNext()) {
            int comparison = i.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " already is at destinations.");
                return false;
            } else if (comparison > 0) {
                i.previous();
                i.add(newCity);
                return true;
            } else if (comparison < 0) {
                // do nothing move to the next item in linkedlist;
            }
        }
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> sities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        showMenu();
        while (!quit){
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    showMenu();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }

    }

    private static void showMenu(){
        System.out.println("Please press 0 to quit.\n"+
                "Please press 1 to move to the next city.\n"+
                "Please press 2 to move to the previous city.\n"+
                "Please press 3 to see this menu again.");
    }
}

