package com.javacompletereference;

public class Box {
    int with;
    int height;
    int depth;

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int calculateVolume(){
        return this.height*this.with*this.depth;
    }
    void setDim(int h,int w,int d){
        with = w;
        height = h;
        depth = d;
    }
}
