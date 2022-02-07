package com.wrf.domain;

/**
 * @program: designPattern
 * @description: 实现AMP接口，播放mp4
 * @author: Rifu Wu
 * @create: 2022-02-05 20:15
 **/
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}