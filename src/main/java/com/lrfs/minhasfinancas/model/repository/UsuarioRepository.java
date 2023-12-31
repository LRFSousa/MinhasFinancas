package com.lrfs.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrfs.minhasfinancas.model.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	boolean existsByEmail(String email);
	
	Optional<Usuario> findByEmail(String email);

}

