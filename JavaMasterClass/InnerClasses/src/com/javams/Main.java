package com.javams;

public class Main {

    public static void main(String[] args) {
        Gearbox maclaren = new Gearbox(6);
        maclaren.operateClutch(true);
        maclaren.changeGear(1);
        maclaren.operateClutch(false);
        System.out.println(maclaren.wheelSpeed(1000));
        maclaren.operateClutch(true);
        maclaren.changeGear(2);
        maclaren.operateClutch(false);
        System.out.println(maclaren.wheelSpeed(1000));
//        Gearbox.Gear first = maclaren. new Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));

    }
}
