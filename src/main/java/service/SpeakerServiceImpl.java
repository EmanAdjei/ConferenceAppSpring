package service;

import model.Speaker;
import respository.HibernateSpeakerRepositoryImpl;
import respository.SpeakerRepository;

import  java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
