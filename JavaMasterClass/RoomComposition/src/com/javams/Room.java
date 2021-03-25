package com.javams;

import java.awt.*;

public class Room {
    private Floor floor;
    private RoomWindow window;
    private Wall wall;

    private Table table;
    private Sofa sofa;

    private int light;
    private int health;
    private int clean;
    private int temperature;

    public void turnOnLight(){
        System.out.println("Vkliuchim svet");
    }

    public void relax(){
        System.out.println("Otfohnem na divane");
    }

    public void cleanRoom(){
        System.out.println("sdelaem uborku");
    }

    public void makeItFresh(){
        System.out.println("Provetrim komnatu, ponizim temperaturu");
    }
}
