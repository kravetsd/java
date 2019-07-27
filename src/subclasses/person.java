package subclasses;

public class person implements _comparable<person> {
    private int age;
    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public person(int age) {
        this.age = age;
    }

    public String getName() {
        if (name == null){
            System.out.println( "Please check if your name is OK with name conventions.");
        //checking if statement in getters an setters.
        return "nullname";}//TODO Here we need to test throwing an exceptions!!! and exit code not 0 for example.
        else return name;
    }

    //testing constructor with if/else statements.
    public void setName(String name) {
        if (name.contains("z")) {
            this.name = name;
        } else {
            System.out.println("Your name is not OK with name convention");
        }
    }

    public int compareto (person obj){
        if (age > obj.age) {return 1;}
        else if (age == obj.age) {return 0;}
        else return -1;
    }
}
