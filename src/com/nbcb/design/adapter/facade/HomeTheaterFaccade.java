package com.nbcb.design.adapter.facade;

public class HomeTheaterFaccade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private TheaterLight theaterLight;
    private Screen screen;

    public HomeTheaterFaccade(
            Amplifier amplifier,
            DvdPlayer dvdPlayer,
            PopcornPopper popcornPopper,
            TheaterLight theaterLight,
            Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.theaterLight = theaterLight;
        this.screen = screen;
    }

    public void watchMovie(){
        System.out.println("HomeTheater start watchMovie ...");

        popcornPopper.on(); // �ȴ򿪱��׻���
        popcornPopper.pop(); // ���׻��ȳ�������
        theaterLight.dim(); // �ƹⰵ��ȥ
        screen.down();  // ��ӰӫĻ������
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolumn(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie(){
        System.out.println("HomeTheater end watchMovie ...");
        // TODO

    }
}
