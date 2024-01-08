package spring_app.src;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing:\t" + this.music.getSong());
    }

}
