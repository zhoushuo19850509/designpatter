package com.nbcb.design.adapter.facade;

public class Amplifier {

    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private int volumn;

    public Amplifier(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public Amplifier(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void on(){
        System.out.println("Amplifier on ...");
    }

    public void off(){
        System.out.println("Amplifier off ...");
    }
    public void setSurroundSound(){
        System.out.println("Amplifier setSurroundSound ...");
    }


    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }
}
