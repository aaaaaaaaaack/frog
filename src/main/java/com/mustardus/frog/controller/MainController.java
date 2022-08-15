package com.mustardus.frog.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mustardus.frog.Model.Frog;
import com.mustardus.frog.repository.FrogRepository;


@RestController
public class MainController {

	@Autowired
	private FrogRepository frogrepository;

    @GetMapping("/")
    public static String home(){
       return "ssdfsdf";
    }
    
//    For Fetching of frogs in the DB
    @GetMapping("/froglist")
    public List<Frog> getFrogs() {
    	
    	return frogrepository.findAll();
    	
    }

//    For Fetching of Frogs by ID
    @GetMapping(path="froglist/{id}")
    public Frog getFrogByID(@PathVariable int id) {
    	try {
    		return frogrepository.findById(id).get();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
    	return null;
    }
    
//    FOR Deletiong
    @DeleteMapping("/deleteFrog/{id}")
    public String deleteFrog(@PathVariable int id) {
    	frogrepository.deleteById(id);
    	return "deleted Frog " + id;
    }
    
//    FOR Update
//    id, sciname, localname, color, info
    @PutMapping("/frogUpdate/{id}")
    public Frog updateFrog(@RequestBody Frog updateFrog,
    		@PathVariable int id) {
    	Frog frog = new Frog();
    	frog.setId(id);
    	frog.setSciName(updateFrog.getSciName());
    	frog.setLocalName(updateFrog.getLocalName());
    	frog.setColor(updateFrog.getColor());
    	frog.setInfo(updateFrog.getInfo());
    	return frogrepository.save(frog);
//    	System.out.println(frog.toString());
  
    }
    
//    For saving of Frog list
    @PutMapping("/newFrog")
    public Frog saveFrog(@RequestBody Frog newFrog) {
    	return frogrepository.save(newFrog);
    }
}
