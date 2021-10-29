package com.jason.core.dao;

import com.jason.core.data.Climber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Climber, Integer > {

}
