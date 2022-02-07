package com.wrf.domain;

/**
 * @program: designPattern
 * @description: 实现AdvancedMediaPlayer接口
 * @author: Rifu Wu
 * @create: 2022-02-05 16:11
 **/
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么都不做
    }
}