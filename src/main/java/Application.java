import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.SpeakerService;
import service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appCotext = new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appCotext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
        System.out.println(service.findAll().get(0).getLastName());
    }
}
