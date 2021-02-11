public class Hello {

    public static void main ( String[] args){
        System.out.println("Hello World");
        String st = getString();
        System.out.println("A new string will be printed");
        System.out.println(st);

    }
    public static String getString(){
        String someStr;
        someStr = "this is a new string in memory for debugging";
        return someStr;
    }
}
