package com.example.DesignPatterns.Structural.bridge;

public class PSG extends Team{

    public PSG(Player player) {
        super(player);
    }

    @Override
    public void startPlaying() {
        System.out.println(player.play() + "PSG");
    }
}
