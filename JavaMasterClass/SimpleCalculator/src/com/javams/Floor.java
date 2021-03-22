package com.javams;

class Floor {
    private double width;
    private double length;

    public Floor(double width, double length){
        if (width<0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length<0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea(){
        return this.length*this.width;
    }

    static class Carpet{
        private double cost;

        Carpet(double cost){
            if (cost<0){
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }

        public double getCost(){
            return this.cost;
        }
    }

    static class Calculator{
        private Floor floor;
        private Carpet carpet;

        Calculator(Floor floor, Carpet carpet){
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            return floor.getArea()*carpet.getCost();
        }
    }

/*    public static void main(String[] args) {
        Floor floor = new Floor(12,10);
        Carpet carpet = new Carpet(8);

        Calculator calc = new Calculator(floor,carpet);
        System.out.println("The total cost to cover a floor with area="+floor.getArea()+
                " with a carper of cost="+carpet.getCost()+"is :"+calc.getTotalCost());

    }*/
    public static void main(String[] args){
        Floor floor = new Floor(12,10);
        Carpet carpet = new Carpet(8);

        Calculator calc = new Calculator(floor,carpet);
        System.out.println("The total cost to cover a floor with area="+floor.getArea()+
                " with a carper of cost="+carpet.getCost()+"$ "+"is : "+calc.getTotalCost()+"$");
    }
}


