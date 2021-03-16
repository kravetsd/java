package com.javacompletereference;

public class Main {

    public static void main(String[] args) {
        // initializing referencing to a BOX class
        Box mybox;
        Box mybox2;

        // allocating in objects in heap
        mybox = new Box();
        mybox2 = new Box();


        // Customizing boxes using setters:
        mybox.setDim(6,2,4);

        mybox2.setDim(2,1,5);

        // Calculating volume for both boxes:
        int myBox1Vol = mybox.calculateVolume();
        int myBox2Vol = mybox2.calculateVolume();

        System.out.println("mybox volume = "+myBox1Vol+", mybox2 volume = "+myBox2Vol);
        


    }
}
