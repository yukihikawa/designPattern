package com.wrf.domain;

/**
 * @program: designPattern
 * @description: ʵ��AMP�ӿڣ�����mp4
 * @author: Rifu Wu
 * @create: 2022-02-05 20:15
 **/
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //ʲôҲ����
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}