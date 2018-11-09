package com.azure.coconut.soundsystem;


public class AzureCD implements CompactDisc {
    private String artist="Azure Chien";
    private String title="Incarnation";
    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
