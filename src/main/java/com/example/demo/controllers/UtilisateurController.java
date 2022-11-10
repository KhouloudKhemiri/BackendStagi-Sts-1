package com.example.demo.controllers;


import java.sql.Date
;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.demo.aplication.Utilisateur;
import com.example.demo.services.UtilisateurService;




@CrossOrigin("*") // cht3ml
@RestController
@RequestMapping("/User")
public class UtilisateurController {
	@Autowired
	private UtilisateurService utlisateurService;
	
	
	@GetMapping("/user")
	public List<Utilisateur> GetUser() {
		return utlisateurService.getAllUtilisateurs();
	}

	@PostMapping("/ps")
	public  Utilisateur PostUser(@RequestBody Utilisateur utlisateur) {
		return utlisateurService.createUtlisateur(utlisateur);
	}

	@PostMapping(path="/login")
	  public ResponseEntity<List<Utilisateur>>findBylogin(@RequestBody Utilisateur u){
			List<Utilisateur> utilisateur=utlisateurService. findByMailAndPasseword(u.getMail(), u.getPasseWord());
			  
			if(utilisateur.isEmpty()) {
				return new ResponseEntity<List<Utilisateur>>(HttpStatus.UNAUTHORIZED);
			}else
			  return new ResponseEntity<List<Utilisateur>>(utilisateur,HttpStatus.OK);
			  
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
