package com.javams;

public class RoomWindow {
    private String size;
    private boolean isOpen;

    public RoomWindow(String size, boolean isOpen) {
        this.size = size;
        this.isOpen = isOpen;
    }

    public void openWindow(){
        this.isOpen = true;
        System.out.println("Otkryl okno");
    }

    public String getSize() {
        return size;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
