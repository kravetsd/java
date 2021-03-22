public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name,int size, int weight, int gills,int eyes,int fins){
        super(name,1,1,size,weight);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }
    private void moveBackfin(){

    }
    private void swim(int speed){
        moveMuscles();
        moveBackfin();
        super.move(speed);
    }
}
