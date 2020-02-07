package fan.stu.springannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloJapanConfig {

    @Bean
    public HelloJapan getHelloJapan() {
        return new HelloJapan();
    }

}
