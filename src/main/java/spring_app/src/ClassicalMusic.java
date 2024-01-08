package spring_app.src;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public String getGenre(){  return "Classic";  }
}
