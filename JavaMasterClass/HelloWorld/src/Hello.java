public class Hello {

    public static void main ( String[] args){
        System.out.println("Hello World");
        String st = getString();
        System.out.println("A new string will be printed");
        int myFirstNumber = 5;
        int mySecondNumber = 13;
        int myThirdNumber = myFirstNumber*2 + mySecondNumber;
        int myTotal = myThirdNumber*(2+8);
        System.out.println(st);
        System.out.println(myTotal);

    }
    public static String getString(){
        String someStr;
        someStr = "this is a new string in memory for debugging";
        return someStr;
    }
}
