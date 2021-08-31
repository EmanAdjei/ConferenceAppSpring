import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pluralsight.service.SpeakerService;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService pluralsight.service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
        System.out.println(service.findAll().get(0).getLastName());

        //Seeded value passed into application using expression language
        System.out.println(service.findAll().get(0).getSeedNum());

        System.out.println(service);

        //Prove it is Singleton or Prototype based on scope
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);
    }
}
