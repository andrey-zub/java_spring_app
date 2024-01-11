package spring_app.src;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer plr = context.getBean("player", MusicPlayer.class);
        plr.playList();

        Computer cmp = context.getBean("computer", Computer.class);
        cmp.setMusicPlayer(plr);

        //System.out.println(cmp.toString());


         ///////////////////////////////////////////////////////////
         context.close();
    }
}
