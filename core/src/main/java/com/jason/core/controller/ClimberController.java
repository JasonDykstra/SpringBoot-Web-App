package com.jason.core.controller;

import com.jason.core.data.Climber;
import com.jason.core.service.ClimberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ClimberController {
    @Autowired
    ClimberService climberService;

    @PostMapping
    public void saveClimberProfile(@RequestBody Climber climberProfile) {
        climberService.addClimberProfile(climberProfile);
    }

    @GetMapping
    public List <Climber> getAllClimbers() {
        return climberService.getClimberProfiles();
    }

}
