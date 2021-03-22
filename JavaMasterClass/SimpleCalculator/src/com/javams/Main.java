package com.javams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        //initializing calculator:
        calc.setFirstNumber(45);
        calc.setSecondNumber(23);

        double add1 = calc.getFirstNumber();
        double add2 = calc.getSecondNumber();
        System.out.println(add1+"+"+add2+"="+calc.getAdditionResult());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Initializing a person....");
        Person man = new Person();

        System.out.println("... plese enter person's first name: ");
        String name = scanner.nextLine();
        man.setFirstName(name);
        System.out.println("first name is "+man.getFirstName());

        System.out.println("... plese enter person's last name: ");
        String surname = scanner.nextLine();
        man.setLastName(surname);
        System.out.println("last name is "+man.getLastName());

        System.out.println("... plese enter person's age: ");
        int age=scanner.nextInt();
        man.setAge(age);

        scanner.close();

        System.out.println("Person was initialized:");


        // Opening bank account for the person:
        BankAccount newAcc = new BankAccount();
        newAcc.setCustomerName(man.getFullName());
        newAcc.setBalance(100);
        newAcc.withfrawFounds(40);
        newAcc.depositFounds(10);

        //generating a new account:
        BankAccount myacc1 = new BankAccount(123563,100,"Dasha Kravets","uddar@mail.ru","+77012139824");
        myacc1.getBalance();
        myacc1.getPhoneNumber();

        }

        public void testPoint(){
            Point p1 = new Point();
            p1.setX(6);
            p1.setY(5);
            System.out.println(p1.distance());

            Point p2 = new Point(3,1);

            System.out.println(p1.distance(-1,-1));
            System.out.println(p1.distance(p2));
        }
    }