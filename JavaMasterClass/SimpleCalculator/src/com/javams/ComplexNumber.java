package com.javams;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }

    public void add(ComplexNumber complexNumber){
        this.real+=complexNumber.getReal();
        this.imaginary+=complexNumber.getImaginary();
    }

    public void subtract(double real,double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        this.real-=complexNumber.getReal();
        this.imaginary-=complexNumber.getImaginary();
    }
}

class testComplex{
    public static void main(String[] args) {
        ComplexNumber im1 = new ComplexNumber(1.0,1.0);
        ComplexNumber im2 = new ComplexNumber(2.5,-1.5);

        im1.add(1,1);
        System.out.println("im1.real = "+im1.getReal());
        System.out.println("im1.imaginary = "+im1.getImaginary());

        im1.subtract(im2);
        System.out.println("im1.real = "+im1.getReal());
        System.out.println("im1.imaginary = "+im1.getImaginary());

        im2.subtract(im1);
        System.out.println("im2.real = "+im2.getReal());
        System.out.println("im2.imaginary = "+im2.getImaginary());

    }

}
