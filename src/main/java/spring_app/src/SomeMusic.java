package spring_app.src;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SomeMusic implements Music{

    @Value("#{'${someMusic.songs}'.split(',')}")
    private List<String> songs = new ArrayList<>();
   public SomeMusic() {};

//   public static SomeMusic getSomeMusic(){
//       return new SomeMusic();
//   };

    @Override
    public List<String> getSongsList() {
        return this.songs;
    }

    @Override
    public String getSong() {
        return "КИШ - Хозяин леса";
    }

    @Override
    public String getGenre() {
        return "Панк-рок";
    }

    public void doInit() {
        System.out.println("INIT");
    }


    public void doDestroy() {
        System.out.println("DESTROY");
    }
}
