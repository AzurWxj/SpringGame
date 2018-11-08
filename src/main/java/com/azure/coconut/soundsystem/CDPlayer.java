package com.azure.coconut.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }



    @Override
    public void play() {
        cd.play();
    }

    @Override
    public CompactDisc getCD() {
        return cd;
    }
}
