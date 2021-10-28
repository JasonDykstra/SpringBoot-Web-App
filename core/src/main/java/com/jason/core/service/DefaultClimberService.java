package com.jason.core.service;

import com.jason.core.data.Climber;
import org.springframework.stereotype.Service;

@Service("climberService")
public class DefaultClimberService implements ClimberService{

    @Override
    public Climber getClimberById(int id){
        return new Climber(id, "Jason", 50);
    }

}
