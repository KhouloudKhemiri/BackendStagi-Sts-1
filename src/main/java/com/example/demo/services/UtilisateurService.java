package com.example.demo.services;

import java.util.List;

import com.example.demo.aplication.Utilisateur;

import ch.qos.logback.core.net.LoginAuthenticator;

public interface UtilisateurService {
	public List <Utilisateur> getAllUtilisateurs();
	public Utilisateur createUtlisateur (Utilisateur utlisateur);
	public Utilisateur findByIdUtilisateur(Long id);
	public Utilisateur UpdateUtilisateur (Utilisateur utlisateur);
	
	public void deleteUtilisateu (Long id);
	 public Utilisateur login (String mail,String passeWord );
	 
	

}
