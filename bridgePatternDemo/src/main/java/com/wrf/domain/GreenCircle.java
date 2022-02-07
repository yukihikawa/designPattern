package com.wrf.domain;

/**
 * @program: designPattern
 * @description: ʵ���� DrawAPI �ӿڵ�ʵ���Ž�ʵ����
 * @author: Rifu Wu
 * @create: 2022-02-06 22:25
 **/
public class GreenCircle implements DrawAPI{
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}