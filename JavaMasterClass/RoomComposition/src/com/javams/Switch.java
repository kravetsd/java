package com.javams;

public class Switch {
    private boolean lightIsOn;

    public Switch(boolean lightIsOn) {
        this.lightIsOn = lightIsOn;
    }

    public boolean isLightIsOn() {
        return lightIsOn;
    }

    public void turnOnLight() {
        System.out.println("Vkliuchil svet");
        this.lightIsOn = true;
    }

    public void turnOffLight() {
        System.out.println("Vikluchil svet");
        this.lightIsOn = false;
    }
}
