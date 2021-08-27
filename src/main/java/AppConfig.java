import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"pluralsight"})
public class AppConfig {

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
