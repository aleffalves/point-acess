package com.github.aleffalves.pointacess.service;

import com.github.aleffalves.pointacess.model.WorkJorney;
import com.github.aleffalves.pointacess.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkJorney save(WorkJorney workJorney){
        return journeyRepository.save(workJorney);
    }

    public List<WorkJorney> findAll() {
        return journeyRepository.findAll();
    }

    public Optional<WorkJorney> getById(Long idJornada) {
        return journeyRepository.findById(idJornada);
    }

    public WorkJorney update(WorkJorney workJorney){
        return journeyRepository.save(workJorney);
    }

    public void deleteJourney(Long idJouney){
        journeyRepository.deleteById(idJouney);
    }
}
