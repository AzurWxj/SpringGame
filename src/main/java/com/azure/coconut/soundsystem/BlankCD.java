package com.azure.coconut.soundsystem;

import java.util.List;

public class BlankCD implements CompactDisc {
    private String author,title;
    private List<String> songs;

    public BlankCD(String author, String title, List<String> songs) {
        this.author = author;
        this.title = title;
        this.songs = songs;
    }

    @Override
    public void play() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("BlankCD{\nauthor='").append(author).append("',\ntitle='")
                .append(title).append("',\nsongs=[").append(String.join(",",songs)).append("]}");
        System.out.println(stringBuilder.toString());
    }

    @Override
    public String toString() {
        return "BlankCD{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
