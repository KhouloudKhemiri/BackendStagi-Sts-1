package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.aplication.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;

@Service
public class UtlisateurServiceImp implements UtilisateurService {
	@Autowired
	private UtilisateurRepository utlisateurRepository;

	@Override
	public List<Utilisateur> getAllUtilisateurs() {

		return utlisateurRepository.findAll();
	}

	@Override
	public Utilisateur createUtlisateur(Utilisateur utlisateur) {
		
		return utlisateurRepository.save(utlisateur);
	}

	@Override
	public Utilisateur findByIdUtilisateur(Long id) {
		Optional<Utilisateur> utOptional = utlisateurRepository.findById(id);
		if (utOptional.isEmpty()) {
			return null;
		} else {
			return utOptional.get();
		}

	}

	@Override
	public Utilisateur UpdateUtilisateur(Utilisateur utlisateur) {
		Optional<Utilisateur> utOptional = utlisateurRepository.findById(utlisateur.getId());
		
		if (utOptional.isEmpty()) {
			return null;
		} else {
			return utlisateurRepository.save(utlisateur);
		}

	}

	@Override
	public void deleteUtilisateu(Long id) {
		utlisateurRepository.deleteById(id);

	}

	

	@Override
	public Utilisateur login(String mail, String passeWord) {
		
		return utlisateurRepository.findByMailAndPasseWord(mail, passeWord) ;
	}
	
	
	}
