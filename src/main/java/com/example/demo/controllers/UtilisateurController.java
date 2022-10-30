package com.example.demo.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Requests.loginRequest;
import com.example.demo.aplication.Utilisateur;
import com.example.demo.services.UtilisateurService;





@RestController
@RequestMapping("/User")
public class UtilisateurController {
	@Autowired
	private UtilisateurService utlisateurService;
	
	
	@GetMapping
	public List<Utilisateur> GetUser() {
		return utlisateurService.getAllUtilisateurs();
	}

	@PostMapping
	public  Utilisateur PostUser(@RequestBody Utilisateur utlisateur) {
		return utlisateurService.createUtlisateur(utlisateur);
	}

	@GetMapping(path="/login")
	public Utilisateur loginUtilisateur(@RequestBody loginRequest LoginRequest) {
		return utlisateurService.login(LoginRequest.getEmail(), LoginRequest.getPassword());
	}

	@DeleteMapping(path= {"/{id}"})
	public void DeleteUser(@PathVariable Long  id) {
		utlisateurService.deleteUtilisateu(id);;
	}
	@GetMapping(path={"/{id}"})
	public Utilisateur findUtlisateurById (@PathVariable Long id ) {
		return utlisateurService.findByIdUtilisateur(id);
		
	}
	@PutMapping
	public Utilisateur PutUser(@RequestBody Utilisateur utilisateur) {
		return utlisateurService.UpdateUtilisateur(utilisateur);
	}

}
