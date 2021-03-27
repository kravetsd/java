package com.javams;

public class Wall {
    private String color;
    private int width;
    private int height;
    private Switch lightSwitcher;
    private RoomWindow window;

    public Wall(String color, int width, int height, RoomWindow window) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.window = window;
    }


    public Wall(String color, int width, int height, Switch lightSwitcher) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.lightSwitcher = lightSwitcher;
    }


    public void paintWall(String color){
        System.out.println("Pokrasil stenu v "+color+" cvet");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Switch getLightSwitcher() {
        System.out.println("Podoshel k vikluchateliu");
        return lightSwitcher;
    }

    public RoomWindow getWindow() {
        System.out.println("Podoshel k oknu");
        return window;
    }
}
