package com.example.jokeapp;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Audio {

    private String track; // адрес трека(файла)
    private Clip clip = null;// ссылка на объект класса
    private FloatControl volumeC = null;// контролер громкости
    private double wt; //уровень громкости
    private boolean pl_audio;// воспроизведение звука

    //конструктор (адрес файла, уровень громкости)
    public Audio( String track, double wt){
        this.track = track;
        this.wt =wt;
        this.pl_audio = false;
    }

    // пероигрывать звук объкта одиночное проигрывание с stop()
    public void play() {
        File f = new File(this.track);// передаем звуковой файл в f
        //поток для записи и считывания
        AudioInputStream tr = null; // обьект потока AudioInputStream пуст
        try {
            tr = AudioSystem.getAudioInputStream(f); // Получаем AudioInputStream (нужный файл)
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            clip = AudioSystem.getClip();//Получаем реализацию интерфейса Clip
            clip.open(tr); //Загружаем наш звуковой поток в Clip
            //Получаем контроллер громкости
            volumeC = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            if(!this.pl_audio) {
                clip.setFramePosition(0); //устанавливаем указатель на старт
                clip.start(); //Поехали!!!
                this.pl_audio = true; // играет
            }

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

