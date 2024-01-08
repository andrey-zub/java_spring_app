package spring_app.src;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> playList = new ArrayList<>();

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(List<Music> play_list) {this.playList = this.getPlayList();}
    public MusicPlayer() {};

    public void player() {
        System.out.println("/////");
        System.out.println("Player_name:\t" + this.getName());
        System.out.println("Player_volume:\t" + this.getVolume());
        System.out.println("/////\n");
       // System.out.println("Playing:\t" + this.music.getSong());

    }

    public void playList() {
        List<Music> list = this.getPlayList();

        for  (  Music item : list ) {
            System.out.println("---");
            System.out.println(  "Genre:\t " + item.getGenre()+ "\n"+ "Song: \t" + item.getSong() );
        }


    }



    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }
}
