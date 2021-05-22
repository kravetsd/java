package com.javams;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");



    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {

            public ClickListener(){
                System.out.println("I have been attached");
            }
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
//        Gearbox maclaren = new Gearbox(6);
////        maclaren.operateClutch(true);
////        maclaren.changeGear(1);
////        maclaren.operateClutch(false);
////        System.out.println(maclaren.wheelSpeed(1000));
////        maclaren.operateClutch(true);
////        maclaren.changeGear(2);
////        maclaren.operateClutch(false);
////        System.out.println(maclaren.wheelSpeed(1000));
//        Gearbox.Gear first = maclaren. new Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));

    }
    public static void listen(){
        boolean quit = false;

        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
