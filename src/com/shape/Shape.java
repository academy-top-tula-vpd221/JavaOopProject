package com.shape;

public class Shape {
    int x;
    int y;

    public Shape(){ x = 0; y = 0; }
    public Shape(int x, int y){ this.x = x; this.y = y; }

    //public abstract int Square();

    public void Info()
    {
        System.out.printf("x = %d, y = %d\n", x, y);
    }
}


