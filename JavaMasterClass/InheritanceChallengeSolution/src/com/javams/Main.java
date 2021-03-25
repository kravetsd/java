package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Outlander outlander = new Outlander(12);
        checkStatus(outlander);

        outlander.changetGear(2);
        checkStatus(outlander);

        outlander.acceletate(10);
        checkStatus(outlander);

        outlander.acceletate(20);
        checkStatus(outlander);

        outlander.steer(10);
        checkStatus(outlander);

        outlander.move(30,24);
        checkStatus(outlander);

        outlander.steer(-34);
        outlander.acceletate(-50);
        checkStatus(outlander);


    }
    public static void checkStatus(Outlander outlander){
        System.out.println("Checkng speedometer and compas:");
        System.out.println(outlander.getCurrentVelocity());
        System.out.println(outlander.getGetCurrentDirection());
    }
}
