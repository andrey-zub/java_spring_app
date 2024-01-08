package spring_app.src;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    public String getSong() {
        return "That is aproaching";
    }

    public String getGenre(){  return "Rock"; }

}
