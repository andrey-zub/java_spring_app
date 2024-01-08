package spring_app.src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

         //Music  music = context.getBean("musicBean", Music.class);
         MusicPlayer plr_1 = context.getBean("musicPlayer", MusicPlayer.class);
         MusicPlayer plr_2 = context.getBean("musicPlayer", MusicPlayer.class);

         plr_1.setVolume(40);
        plr_1.player();

        plr_2.setVolume(80);
        plr_2.setName("Player_2");
        plr_2.player();
/*
         boolean exp = plr_1 == plr_2;
         System.out.println(exp);
         System.out.println(plr_1);
         System.out.println(plr_2);
*/


         ///
         context.close();





    }
}
