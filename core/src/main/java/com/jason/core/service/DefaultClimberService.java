package com.jason.core.service;

import com.jason.core.dao.ProfileRepository;
import com.jason.core.data.Climber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

@Service("climberService")
public class DefaultClimberService implements ClimberService{

    @Override
    public Climber getClimberById(int id){
        return new Climber(id, "Jason", 50);
    }

    @Autowired
    ProfileRepository repository;
//    List <Climber> climberProfileList = new ArrayList<>();

    @Override
    public void addClimberProfile(Climber profile) {
        repository.save(profile);
    }

    @Override
    public List <Climber> getClimberProfiles() {
        return repository.findAll();
    }

}
