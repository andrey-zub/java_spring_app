package spring_app.src;

import org.springframework.stereotype.Component;

@Component
public class JassMusic implements Music{

    public String getSong() {
        return "What A Wonderful World";
    }

    public String getGenre(){  return "Jass";  }
}
