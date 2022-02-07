package com.wrf.domain;

/**
 * @program: designPattern
 * @description:  µœ÷Shape¿‡
 * @author: Rifu Wu
 * @create: 2022-02-07 00:17
 **/
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}