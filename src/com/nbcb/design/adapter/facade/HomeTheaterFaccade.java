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

        popcornPopper.on(); // 先打开爆米花机
        popcornPopper.pop(); // 爆米花先吃起来！
        theaterLight.dim(); // 灯光暗下去
        screen.down();  // 电影荧幕降下来
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
