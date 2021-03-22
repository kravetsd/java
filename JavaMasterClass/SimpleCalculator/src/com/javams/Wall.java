package com.javams;

public class Wall {
    private double height;
    private double width;

    public Wall () {
    }

    public Wall (double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.height*this.width;
    }

/*    public static void main(String[] args) {
        Wall newall = new Wall(2.0,4);
        Wall secwall = new Wall();

        System.out.println(newall.getArea());
        secwall.setHeight(4);
        secwall.setWidth(2);
        System.out.println(secwall.getArea());
    }*/
}