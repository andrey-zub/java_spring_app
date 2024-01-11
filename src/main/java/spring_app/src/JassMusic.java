package spring_app.src;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JassMusic implements Music{

    @Value("#{'${jassMusic.songs}'.split(',')}")
    private List<String> songs = new ArrayList<>();
    public JassMusic (){}
    @Override
    public List<String> getSongsList() {
        return this.songs;
    }

    public String getSong() {
        return "What A Wonderful World";
    }

    public String getGenre(){  return "Jass";  }
}
