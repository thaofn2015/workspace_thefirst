package fan.stu.springannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloVietNamConfig {

    @Bean
    public HelloVietNam getHelloVietNam() {
        return new HelloVietNam();
    }

}
