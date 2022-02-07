package com.wrf.domain;

/**
 * @program: designPattern
 * @description: �����࣬ʹ��DrawAPI�ӿ�
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
