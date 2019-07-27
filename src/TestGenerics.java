import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import subclasses.*;
public class TestGenerics {
    //1. comparing two persons using simple generics and interface _comparable:
    //TODO We need to add one more field for example "weight" and the next test should contain comparison fo both
    // "age" and "weight" field.


    public static void main(String[] args) {
        person m = new person(25);
        person n = new person( 25);
        m.setName("Dmitriy");
        if (m.compareto(n) ==0) {
            System.out.println("the same age");
        }
        else System.out.println("not equal age");
        System.out.println(m.getName());
    }
}