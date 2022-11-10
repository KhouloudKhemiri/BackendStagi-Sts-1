package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Entreprise;
import com.example.demo.repository.EntreprisRepository;

@Service

public class EntrepriseServiceImp implements EntrepriseService {
	@Autowired
	private EntreprisRepository entreprisRepository;

	

	@Override
	public Entreprise createEntreprise(Entreprise entreprise) {

		return entreprisRepository.save(entreprise);
	}

	@Override
	public Entreprise UpdateEntreprise(Entreprise entreprise) {
		Optional<Entreprise>utOptional=entreprisRepository.findById(entreprise.getId());
		if (utOptional.isEmpty()) {
		return null;}
		else {
			return entreprisRepository.save(entreprise);
		}
	}

	@Override
	public void deleteEntreprise(Long id) {
		entreprisRepository.deleteById(id);

	}

	@Override
	public Entreprise login(String mail, String passeWord) {
		
		return entreprisRepository.findByMailAndPasseWord(mail, passeWord);
	}

	@Override
	public Entreprise findByIdEntreprise(Long id) {
		Optional<Entreprise> utOptional = entreprisRepository.findById(id);
		if (utOptional.isEmpty()) {
			return null;
		} else {
			return utOptional.get();
		}

		
	}

	@Override
	public List<Entreprise> getAllEntreprises() {
		
		return entreprisRepository.findAll();
	}
	

}
