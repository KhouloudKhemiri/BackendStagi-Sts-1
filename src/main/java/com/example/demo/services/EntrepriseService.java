package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Entreprise;

public interface EntrepriseService {
	public List<Entreprise> getAllEntreprises();
	public Entreprise createEntreprise(Entreprise entreprise);
	public Entreprise UpdateEntreprise(Entreprise entreprise);
	public void deleteEntreprise (Long id);
	public Entreprise login (String mail, String passeWord);
	public Entreprise findByIdEntreprise(Long id);
}