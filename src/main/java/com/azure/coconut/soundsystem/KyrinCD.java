package com.azure.coconut.soundsystem;


public class KyrinCD implements CompactDisc {
    private String artist="Kyrin Woo";
    private String title="Upcoming";
    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
