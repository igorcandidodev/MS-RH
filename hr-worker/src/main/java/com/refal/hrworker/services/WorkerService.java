package com.refal.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refal.hrworker.entities.Worker;
import com.refal.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerDAO;

	
	public List<Worker> findAll() {
		List<Worker> list = workerDAO.findAll();
		
		return list;
	}
	
	public Worker findById(Long id) {
		Optional<Worker> obj = workerDAO.findById(id);
		
		return obj.get();
	}
}
