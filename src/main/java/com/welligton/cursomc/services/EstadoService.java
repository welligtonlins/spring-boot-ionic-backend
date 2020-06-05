package com.welligton.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welligton.cursomc.domain.Estado;
import com.welligton.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired 
	private EstadoRepository repo;

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
}