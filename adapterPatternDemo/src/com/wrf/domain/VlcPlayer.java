package com.wrf.domain;

/**
 * @program: designPattern
 * @description: ʵ��AdvancedMediaPlayer�ӿ�
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
        //ʲô������
    }
}