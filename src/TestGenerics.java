import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import subclasses.*;
public class TestGenerics {
    //1. comparing two persons using simple generics and interface _comparable:


    public static void main(String[] args) {
        person m = new person(25);
        person n = new person( 25);
        if (m.compareto(n) ==0) {
            System.out.println("the same age");
        }
        else System.out.println("not equal age");
    }
}