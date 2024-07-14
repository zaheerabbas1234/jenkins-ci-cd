package com.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.model.Jenkins;
import com.jenkins.repository.JenkinsRepository;


@RestController
@RequestMapping("/jenkins")
public class JenkinsController {
	
	@Autowired
	public JenkinsRepository repo;
	
	@GetMapping("/test")
	public String test() {
		return "welcome to jenkins ci-cd";
	}
	
	@PostMapping("/add")
	public Jenkins add(@RequestBody Jenkins model) {
		
		Jenkins save = repo.save(model);
		
		return save
	}

}
