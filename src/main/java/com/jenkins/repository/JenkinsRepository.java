package com.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jenkins.model.Jenkins;

@Repository
public interface JenkinsRepository extends JpaRepository<Jenkins,String>{

}
