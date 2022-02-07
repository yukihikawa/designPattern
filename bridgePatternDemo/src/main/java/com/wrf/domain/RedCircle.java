package com.wrf.domain;

/**
 * @program: designPattern
 * @description: 实现DrawAPI的实体桥接实现类
 * @author: Rifu Wu
 * @create: 2022-02-06 11:52
 **/
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}