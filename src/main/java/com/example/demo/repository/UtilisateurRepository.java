package com.example.demo.repository;





import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.aplication.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	Optional<Utilisateur> findById(Long id);
	
	

	
	 public List<Utilisateur> findByMailAndPasseWord(String mail,String passeWord);
}

