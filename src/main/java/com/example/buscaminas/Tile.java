package com.example.buscaminas;

public class Tile {
    private int x, y;
    private boolean hasBomb;
    private boolean clicked;

    public Tile(int x, int y, boolean hasBomb, boolean clicked){
        this.x = x;
        this.y = y;
        this.hasBomb = hasBomb;
        this.clicked = clicked;
    }

    public boolean get_hasBomb(){
        return this.hasBomb;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
