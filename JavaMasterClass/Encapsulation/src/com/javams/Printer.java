package com.javams;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;

    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel<0  || tonerLevel>100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<100){
            if (tonerAmount+this.tonerLevel>100){
                return -1;
            } else {
                this.tonerLevel +=tonerAmount;
            }
        } else {
            return -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages/2+pages%2;
            this.pagesPrinted+=pagesToPrint;
        } else {
            System.out.println("Printing in simplex mode");
        }

        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}
