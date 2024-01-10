package spring_app.src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

/*    System.out.println("///some_music\n");
        SomeMusic some = context.getBean("musicBean", SomeMusic.class);
        System.out.println( "Genre:\t" + some.getGenre() + "\nSONG:\t" + some.getSong());

        System.out.println("\n///jass_music\n");
        JassMusic jass = context.getBean("jassMusic", JassMusic.class);
        System.out.println( "Genre:\t" + jass.getGenre() + "\nSONG:\t" + jass.getSong());
*/
        SomeMusic some = context.getBean("musicBean", SomeMusic.class);

        MusicPlayer plr = context.getBean("player", MusicPlayer.class);
        plr.setMusic(some);
       // plr.player();

        Computer cmp = context.getBean("computer", Computer.class);
        cmp.setMusicPlayer(plr);

        System.out.println(cmp.toString());


         ///////////////////////////////////////////////////////////
         context.close();
    }
}
