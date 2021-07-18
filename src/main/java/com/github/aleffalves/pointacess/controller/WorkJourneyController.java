package com.github.aleffalves.pointacess.controller;

import com.github.aleffalves.pointacess.model.WorkJorney;
import com.github.aleffalves.pointacess.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {
    @Autowired
    JourneyService journeyService;

    @PostMapping
    public WorkJorney createJourney(@RequestBody WorkJorney workJorney){
        return journeyService.save(workJorney);
    }

    @GetMapping
    public List<WorkJorney> getWorkJourney(){
        return journeyService.findAll();
    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkJorney> getJornadaByID(@PathVariable("idJourney") Long idJouney) throws Exception {
        return  ResponseEntity.ok(journeyService.getById(idJouney).orElseThrow());

    }

    @PutMapping
    public WorkJorney updateJourney(@RequestBody WorkJorney workJorney){
        return journeyService.save(workJorney);
    }

    @DeleteMapping("/{idJourney}")
    public ResponseEntity<WorkJorney> deleteByID(@PathVariable("idJouney") Long idJourney) throws Exception {
        try {
            journeyService.deleteJourney(idJourney);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkJorney>) ResponseEntity.ok();

    }
}
