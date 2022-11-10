package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Requests.loginRequest;

import com.example.demo.entity.Entreprise;
import com.example.demo.services.EntrepriseService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Entreprise") //localhost:8080/Entreprise//
public class EntrepriseController {
	@Autowired
	private EntrepriseService entrepriseService;
	@GetMapping
	public   List<Entreprise> getAllEntreprise() {
		return entrepriseService.getAllEntreprises();
		
	}
	@PostMapping
	public Entreprise CreateEntreprise(@RequestBody Entreprise entreprise) {
	
	return entrepriseService.createEntreprise(entreprise);

}
	@PutMapping
	public Entreprise UpdateEntreprise(@RequestBody Entreprise entreprise) {
		return entrepriseService.UpdateEntreprise(entreprise);
		
	}
	@DeleteMapping("/{id}")
	public void DeleteEntreprise(@PathVariable Long id) {
		entrepriseService.deleteEntreprise(id);
	}
	@GetMapping("/login")
	public Entreprise login(@RequestBody loginRequest loginRequest) {
		return entrepriseService.login(loginRequest.getEmail(),loginRequest.getPassword());
	}
	@GetMapping(path={"/{id}"})
	public Entreprise findEntrepriseById (@PathVariable Long id ) {
		return entrepriseService.findByIdEntreprise(id);
		
	}
	}
