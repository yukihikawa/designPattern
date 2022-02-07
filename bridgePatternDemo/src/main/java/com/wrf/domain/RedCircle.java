package com.wrf.domain;

/**
 * @program: designPattern
 * @description: ʵ��DrawAPI��ʵ���Ž�ʵ����
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