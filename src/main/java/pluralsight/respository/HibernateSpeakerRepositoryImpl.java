package pluralsight.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    private Date calDate;

    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstname("John");
        speaker.setLastName("Doe");
        speaker.setSeedNum(seedNum);

        calDate = cal.getTime();

        //Gets printed twice, find all method called twice
        System.out.println("cal: " + calDate);

        speakers.add(speaker);

        return speakers;
    }

}
