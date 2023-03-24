package com.nbcb.design.adapter.facade;

import javax.annotation.PostConstruct;

public class HomeTheaterTest {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Screen screen = new Screen();
        TheaterLight theaterLight = new TheaterLight();
        Amplifier amplifier = new Amplifier(dvdPlayer);
        HomeTheaterFaccade homeTheaterFaccade = new
                HomeTheaterFaccade(amplifier,
                dvdPlayer,
                popcornPopper,
                theaterLight,
                screen);

        homeTheaterFaccade.watchMovie();

    }
}
