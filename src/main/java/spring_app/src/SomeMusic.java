package spring_app.src;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class SomeMusic implements Music{
   private SomeMusic() {};
   public static SomeMusic getSomeMusic(){
       return new SomeMusic();
   };

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
