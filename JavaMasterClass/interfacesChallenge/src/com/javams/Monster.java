package com.javams;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int damage;

    public Monster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Monster{"+
                "name='"+this.name+"'"+
                ", hitpoints="+this.hitPoints+
                ", damage="+this.damage+"}";
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public List<String> write() {
        ArrayList<String> savedValues = new ArrayList<String>();
        savedValues.add(0,this.name);
        savedValues.add(1,""+this.hitPoints);
        savedValues.add(2,""+this.damage);
        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues.size()==3){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.damage = Integer.parseInt(savedValues.get(2));
        } else {
            System.out.println("No values found to load.");
        }
    }
}
