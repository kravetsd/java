package com.javams;

public class parseValueFromString {
    public static void numberAsString(String strnum){
        int intnum = Integer.parseInt(strnum);
        System.out.println("strnum is "+ strnum);
        System.out.println("intnum is "+ intnum);

        strnum +=1;
        intnum +=1;
        System.out.println("incremented strnum is "+ strnum);
        System.out.println("incremented intnum is "+ intnum);
    }
}
