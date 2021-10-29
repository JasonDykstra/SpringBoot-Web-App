package com.jason.core.service;

import com.jason.core.data.Climber;

import java.util.List;

public interface ClimberService {

    Climber getClimberById(final int id);
    void addClimberProfile(Climber profile);
    List<Climber> getClimberProfiles();
}
