package com.patrick.springnelioudemay.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrick.springnelioudemay.entity.Categoria;
import com.patrick.springnelioudemay.repository.CategoriaRepository;


@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepo;
	
	public Categoria find(Integer id) {
		
		Optional<Categoria> cat = categoriaRepo.findById(id);
		
		return cat.orElse(null);
	}
	
}
