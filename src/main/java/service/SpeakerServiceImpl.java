package service;

import model.Speaker;
import respository.HibernateSpeakerRepositoryImpl;
import respository.SpeakerRepository;

import  java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
