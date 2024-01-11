package spring_app.src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class Computer {
private  int id;
private  MusicPlayer musicPlayer;

    public Computer() {};

@Autowired
public Computer(MusicPlayer musicPlayer){
    this.id = ThreadLocalRandom.current().nextInt(1,256);
    this.musicPlayer = musicPlayer;
};
@Override
    public String toString(){
    return "Computer ID:\t" + this.getId() + "\n"
            + this.musicPlayer.toString();
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
