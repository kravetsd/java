import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        //        placesToVisit.add(1, "MAIKUDUK");

        addInOrder(placesToVisit,"Maikuduk");
        addInOrder(placesToVisit,"Berlin");
        printlist(placesToVisit);
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
}

