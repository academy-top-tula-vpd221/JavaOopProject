package com.shape;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle()
    {
        super();
        width = 0;
        height = 0;
    }



    public Rectangle(int x, int y, int width, int height)
    {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void Info()
    {
        super.Info();
        System.out.printf("width = %d, height = %d\n", width, height);
    }

    public int Square() {
        return width * height;
    }
}