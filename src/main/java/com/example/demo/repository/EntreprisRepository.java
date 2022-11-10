package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Entreprise;

@Repository
public interface EntreprisRepository extends JpaRepository <Entreprise,Long>{
	Optional<Entreprise> findById (Long id);
	public Entreprise findByMailAndPasseWord( String mail,String passeWord);
}
