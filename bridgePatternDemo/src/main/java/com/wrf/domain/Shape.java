package com.wrf.domain;

/**
 * @program: designPattern
 * @description: 抽象类，使用DrawAPI接口
 * @author: Rifu Wu
 * @create: 2022-02-06 22:26
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
