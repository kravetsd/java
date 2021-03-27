package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case newcase = new Case("240","Dell","220W",dimensions);

        Resolution nativeResolution = new Resolution(640,480);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, nativeResolution);

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4,6,"v2.44");

        PC pc = new PC(newcase,monitor,motherBoard);

        pc.getMonitor().drawPixelAt(4,7,"blue");
        pc.getMotherBoard().loadProgram("Windows 98");
        pc.getTheCase().pressPowerButton();

    }
}
