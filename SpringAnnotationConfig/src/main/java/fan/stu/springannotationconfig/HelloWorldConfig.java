package fan.stu.springannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HelloJapanConfig.class)
public class HelloWorldConfig {

    @Bean
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }

}
