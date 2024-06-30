package main.abstractapp.musicplayer;

public class MusicPlayer {
    private Song currentSong;

    public void play(){
        System.out.println("Playing music " + currentSong);
    }
    public void pause(){
        System.out.println("Paused music");
    }
    public void selectSong(){
        System.out.println("Selected music");
    }
}
