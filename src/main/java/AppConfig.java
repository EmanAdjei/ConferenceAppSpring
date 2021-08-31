import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pluralsight.util.CalendarFactory;

import java.util.Calendar;

@Configuration
@ComponentScan({"pluralsight"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(3);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService(){
//        //SpeakerServiceImpl pluralsight.service = new SpeakerServiceImpl(getSpeakerRepository());
//        SpeakerServiceImpl pluralsight.service = new SpeakerServiceImpl();
//        //pluralsight.service.setRepository(getSpeakerRepository());
//        return pluralsight.service;
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
