package com.javams;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Monster monster = new Monster("BioWoolf",30);
        System.out.println(monster.toString());

        monster.setHitPoints(45);
        monster.setDamage(15);
        System.out.println(monster.toString());

        saveObject(monster);

        monster.setDamage(30);
        System.out.println(monster.toString());

        loadObject(monster);
        System.out.println(monster.toString());

        ISavable nemMonster = new Monster("BioWoolf",30);
        System.out.println(nemMonster.toString());

        ((Monster) nemMonster).setHitPoints(45);
        ((Monster)nemMonster).setDamage(15);
        System.out.println(nemMonster.toString());

        saveObject(nemMonster);

        ((Monster)nemMonster).setDamage(30);
        System.out.println(nemMonster.toString());

        loadObject(nemMonster);
        System.out.println(nemMonster.toString());



//        Player player = new Player("Dima",10,15);
//        System.out.println(player.toString());
//
//        player.setStrength(30);
//        System.out.println(player.toString());
//
//        saveObject(player);
//
//        player.setStrength(35);
//        System.out.println(player.toString());
//
//
//        loadObject(player);
//        System.out.println(player.toString());


    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        int index = 0;

        while (!quit){
            System.out.println("Choose an option:\n"+
                    "1 -> to add a new value\n"+
                    "0 -> to quit the program.\n");
            String option = scanner.nextLine();

            switch (option){
                case "0":
                    quit = true;
                    break;
                case "1":
                    String toAdd = scanner.nextLine();
                    System.out.println("Adding "+toAdd+".");
                    values.add(index,toAdd);
                    index++;
                    break;
                default:
                    break;

            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave){
        for (int i = 0; i < objectToSave.write().size() ; i++) {
            System.out.println("Saving "+objectToSave.write().get(i)+" to a storage device...");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
