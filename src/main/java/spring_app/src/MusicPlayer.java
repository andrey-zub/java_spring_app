package spring_app.src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component("player")
public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;
    private String song;

    @Autowired
    SomeMusic some;
    @Autowired
    JassMusic jass;

    @Value("#{${musicPlayer.playList}}")
    private List<Music> playList = new ArrayList<>();




    public MusicPlayer( @Qualifier("someMusic") Music music){
        this.music = music;
        this.name = "Player_" + music.getGenre();
        this.song = music.getSong();
    }

    public MusicPlayer(List<Music> play_list) {this.playList = this.getPlayList();}
    public MusicPlayer() {

    };

    public void player() {
        System.out.println("/////");
        System.out.println("Player_name:\t" + this.getName());
        System.out.println("Player_volume:\t" + this.getVolume());
        System.out.println("/////\n");
       // System.out.println("Playing:\t" + this.music.getSong());
    }
    public String toString() {
        return "/////" + "\n" +
                "Player_name:\t" + this.getName() + "\n" +
                "Player_curr_song:\t " + this.getSong() + "\n" +
                "Player_volume:\t" + this.getVolume() + "\n"+
                "/////\n";
       // System.out.println("Playing:\t" + this.music.getSong());
    }

    public void playList() {
        List<Music> list = this.getPlayList();
        int playListSize = list.size();
        int randMusic = ThreadLocalRandom.current().nextInt(0,playListSize );

        Music item = list.get(randMusic);

           for ( int i = 0; i < item.getSongsList().size() ; i++ ) {
               int  randSong = ThreadLocalRandom.current().nextInt(0,item.getSongsList().size());

               System.out.println("---");
               System.out.println( "Playing: \t" + item.getSongsList().get(randSong) + "\n"+ "Genre:\t " + item.getGenre()  );
           }


    }


//@Autowired
    public void setMusic(Music music) {
        this.music = music;
        this.name = "Player_" + music.getGenre();
        this.song = music.getSong();
        this.volume = 100;
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
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }
}
