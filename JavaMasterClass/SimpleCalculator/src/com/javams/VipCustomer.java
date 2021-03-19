package com.javams;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    VipCustomer(){
        this("unknonwn",0.0,"unknown@mail.com");
    }

    VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"noemail@mail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        VipCustomer vp = new VipCustomer("Dima",199,"kdykrg@gmail.com");

        VipCustomer vp1 = new VipCustomer();

        VipCustomer vp2 = new VipCustomer("Dasha",100);

        System.out.println(vp.getCreditLimit()+"  "+vp.getName()+" "+vp.getEmail());
        System.out.println(vp1.getCreditLimit()+"  "+vp1.getName()+" "+vp1.getEmail());
        System.out.println(vp2.getCreditLimit()+"  "+vp2.getName()+" "+vp2.getEmail());
    }
}
