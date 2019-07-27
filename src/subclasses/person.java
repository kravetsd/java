package subclasses;

public class person implements _comparable<person> {
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public person(int age) {
        this.age = age;
    }



    public int compareto (person obj){
        if (age > obj.age) {return 1;}
        else if (age == obj.age) {return 0;}
        else return -1;
    }
}
