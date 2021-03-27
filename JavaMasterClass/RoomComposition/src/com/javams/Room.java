package com.javams;

public class Room {
    private Floor floor;
    private Wall wallWithSwich;
    private Wall wallWithWindow;

    private Sofa sofa;

    public Room(Floor floor, Wall wallW, Wall wallS, Sofa sofa) {
        this.floor = floor;
        this.wallWithWindow = wallW;
        this.wallWithSwich = wallS;
        this.sofa = sofa;
    }


    public void relax(){
        System.out.println("Otdohnem na divane");
        getSofa().lieOnTheSofa();
    }

    public void makeItFresh(){
        System.out.println("Provetrim komnatu");
        getWallWithWindow().getWindow().openWindow();
    }

    public void cleanRoom(){
        System.out.println("Priberem komnatu.");
        getFloor().cleanTheFloor();
    }

    public Floor getFloor() {
        System.out.println("Posmotrel na pol");
        return floor;
    }

    public Wall getWallWithSwich() {
        System.out.println("Podoshel k stene s vikluchatelem");
        return wallWithSwich;
    }

    public Wall getWallWithWindow() {
        System.out.println("Podoshel k stene s oknom");
        return wallWithWindow;
    }

    public Sofa getSofa() {
        System.out.println("Podoshel k divanu");
        return sofa;
    }

}
