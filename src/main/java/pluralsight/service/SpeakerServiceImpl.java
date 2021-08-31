package pluralsight.service;

import pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pluralsight.respository.SpeakerRepository;

import javax.annotation.PostConstruct;
import  java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakServiceImpl on Args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("SpeakServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl setter");
        this.repository = repository;
    }

    @PostConstruct
    private void initialised(){
        System.out.println("initialised called after the constructors");
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
