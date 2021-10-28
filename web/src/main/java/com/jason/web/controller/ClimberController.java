package com.jason.web.controller;

import com.jason.core.data.Climber;
import com.jason.core.service.ClimberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@RequestMapping("/climbers")
public class ClimberController {

    @Resource(name = "climberService")
    ClimberService climberService;

    @GetMapping("/climber/{id}")
    public Climber getClimber(@PathVariable int id) {
        return climberService.getClimberById(id);
    }

    @GetMapping("/climber")
    public Climber getSimpleClimber(){
        return climberService.getClimberById(1);
    }

}
