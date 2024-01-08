package spring_app.src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

         //Music  music = context.getBean("musicBean", Music.class);
         MusicPlayer plr = context.getBean("musicPlayer", MusicPlayer.class);
         plr.playMusic();

         context.close();





    }
}
