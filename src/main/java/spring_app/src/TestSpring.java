package spring_app.src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

         //Music  music = context.getBean("musicBean", Music.class);
        // MusicPlayer plr_1 = context.getBean("musicPlayer", MusicPlayer.class);
      //   MusicPlayer plr_2 = context.getBean("musicPlayer", MusicPlayer.class);
        SomeMusic some = context.getBean("musicBean", SomeMusic.class);

        System.out.println("SONG:\t" + some.getSong());



         ///////////////////////////////////////////////////////////
         context.close();
    }
}
