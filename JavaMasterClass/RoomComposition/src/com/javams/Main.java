package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Switch lightswitcher = new Switch(false);
        Wall wallWithLightswitcher = new Wall("grey",3,2,lightswitcher);

        RoomWindow window = new RoomWindow("large",false);
        Wall wallWithWindow = new Wall("grey",4,2,window);

        Table table = new Table("green","wood","small");
        Floor floor = new Floor("brown",4,3,table);

        Sofa sofa = new Sofa("large", "yellow");



        // This is our room:
        Room myRoom = new Room(floor,wallWithWindow,wallWithLightswitcher,sofa);

        myRoom.cleanRoom();
        System.out.println(" ");
        myRoom.relax();
        System.out.println(" ");
        myRoom.makeItFresh();
        System.out.println(" ");
        myRoom.getWallWithSwich().getLightSwitcher().turnOnLight();
    }
}
