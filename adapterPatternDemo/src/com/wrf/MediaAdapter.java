package com.wrf;

import com.wrf.domain.AdvancedMediaPlayer;
import com.wrf.domain.MediaPlayer;
import com.wrf.domain.Mp4Player;
import com.wrf.domain.VlcPlayer;

/**
 * @program: designPattern
 * @description: ʵ��MediaPlayer�ӿڣ���������
 *
 * @author: Rifu Wu
 * @create: 2022-02-05 20:56
 **/
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VlcPlayer();
        if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new Mp4Player();
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVlc(fileName);
        if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMp4(fileName);
    }
}