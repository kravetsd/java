import java.util.ArrayList;
public class oop_1 {
    String name;
    String height;
    int age;
    ArrayList <Integer> myList = new ArrayList<Integer>(5);



    public oop_1(String name, String height) {
        this.name = "mike";
        this.height = height;
    }
    public oop_1(String height) {
        this.name = "mike";
        this.height = height;
    }
    public oop_1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    private void addAge(int somevalue){
        this.age = somevalue;
    }


    //Setting arraylist to store any kind of in staff:

    public void setMyList(ArrayList<Integer> myList, int somevalue) {
        System.out.println("Adding an integer somevalue to your stuff arraylist");
        myList.add(somevalue);
        this.myList = myList;
    }

    public ArrayList<Integer> getMyList() {
        return myList;
    }

    public static void main(String[] args) {
        oop_1 p = new oop_1();
        p.addAge(1);
        p.setMyList(new ArrayList<>(5),6);
        System.out.println("age : "+p.getAge()+
                            "\nheight : "+ p.getHeight()+
                            "\nname : "+ p.getName()+
                            "\nmy integer staff : " + p.getMyList());
        for (int i = 0; i < p.getMyList().size(); i++) {
            System.out.println(p.getMyList().get(i));

        }
    }
}
