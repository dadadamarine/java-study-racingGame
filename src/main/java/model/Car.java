package model;

public class Car {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public void move(){
        position++;
    }
}