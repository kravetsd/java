package com.javams;

public class KiaRio extends Car{
    private String model;
    private String mp3Disk;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMp3Disk() {
        return mp3Disk;
    }

    private void setMp3Disk(String music) {
        this.mp3Disk = music;
    }

    public KiaRio(String color, String model, String mp3Disk ){
        super(4,3,"white");
        this.model = model;
        this.mp3Disk = mp3Disk;
    }

    public void playMusic(){
        System.out.println("KiaRio.playMusic() called. Listening "+getMp3Disk()+" music in Kia Rio");
    }
    @Override
    public void move(int speed) {
        System.out.println("Called KiaRio.move(). Kia is moving");
        playMusic();
        super.move(speed);
    }

    public void goTo(String turn, int speed){
        super.turn(turn);
        move(speed);
    }
}
