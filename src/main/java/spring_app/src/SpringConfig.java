package spring_app.src;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring_app.src")
@PropertySource(value="classpath:musicPlayer.properties", encoding="UTF-8")
public class SpringConfig {

}
