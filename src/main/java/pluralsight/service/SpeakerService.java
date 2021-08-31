package pluralsight.service;

import pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
