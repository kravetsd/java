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
//        printlist(placesToVisit);

        addInOrder(placesToVisit,"Maikuduk");
        addInOrder(placesToVisit,"Berlin");
//        printlist(placesToVisit);
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

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        showMenu();
        String direction = "forward";

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("The list of cities to visit is empty.");
            return;
        } else {
            System.out.println("Visiting "+listIterator.next());
        }

        while (!quit){
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    // go forward:
                    if (!direction.equals("forward")){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        direction = "forward";
                    }
                        if (!listIterator.hasNext()) {
                            System.out.println("You are at the end of the list");
                            direction = "backward";
                            break;
                        } else {
                            String cityToVisit = listIterator.next();
                            System.out.println("Visiting " + cityToVisit);
                            break;
                        }
                case 2:
                    // go backward:
                    if (direction.equals("forward")){
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        direction = "backward";
                    }
                    if (!listIterator.hasPrevious()){
                        System.out.println("You are at very beginning of the list");
                        direction = "forward";
                        break;
                    } else {
                        String cityToVisit = listIterator.previous();
                        System.out.println("Back to " + cityToVisit);
                        break;
                    }
                case 3:
                    showMenu();
                    break;
                case 4:
                    printlist(cities);
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
                "Please press 3 to see this menu again.\n"+
                "Please press 4 to see the whole list of cities to visit.\n"+
                "========================================================");
    }
}

