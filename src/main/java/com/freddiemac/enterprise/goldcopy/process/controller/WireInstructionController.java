package com.freddiemac.enterprise.goldcopy.process.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.freddiemac.enterprise.goldcopy.process.model.Wi;
import com.freddiemac.enterprise.goldcopy.process.repository.WireInstructionRepository;


@RestController
@RequestMapping("/api/v1/wire")
public class WireInstructionController {
	@Autowired
	private WireInstructionRepository wiRepository;
	
	//@GetMapping annotation will forward get requests to List method below
	@GetMapping
	public List<Wi> list(){
		return wiRepository.findAll();
	
	}
	
	//handles post to base URL for new wire instructions
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create (@RequestBody Wi wi) {
		wiRepository.save(wi);
	}
	
	//get a particular instruction and return it
	//add on to base path
	@GetMapping("/{id}")
	public Wi get(@PathVariable("id") long id) {
		return wiRepository.getOne(id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") long id) {
		wiRepository.deleteById(id);
	
	}

}
	
	

