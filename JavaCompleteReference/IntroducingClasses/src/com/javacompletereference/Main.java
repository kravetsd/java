package com.javacompletereference;

public class Main {

    public static void main(String[] args) {
        Box mybox;
        Box mybox2;

        mybox = new Box();
        mybox2 = new Box();

        // Customizing boxes using setters:
        mybox.setDepth(4);
        mybox.setHeight(6);
        mybox.setWith(2);

        mybox2.setWith(1);
        mybox2.setDepth(5);
        mybox2.setHeight(2);


        // Calculating volume for both boxes:
        System.out.println("mybox volume = "+mybox.calculateVolume()+", mybox2 volume = "+mybox2.calculateVolume());



    }
}
