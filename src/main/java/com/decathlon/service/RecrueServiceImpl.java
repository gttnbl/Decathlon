package com.decathlon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decathlon.model.Recrue;
import com.decathlon.repository.RecrueRepository;

@Service
public class RecrueServiceImpl implements RecrueService {

	@Autowired
	RecrueRepository recrueRepository;

	@Override
	public List<Recrue> getAllRecrues() {
		return recrueRepository.findAll();
	}

	@Override
	public void save(Recrue recrue) {
		recrueRepository.save(recrue);
	}

	@Override
	public List<Recrue> getallRecruesByFiliere(String filiere) {
		return recrueRepository.findByFiliere(filiere);
	}

	@Override
	public List<Recrue> getallRecruesByLeader(String leader) {
		return recrueRepository.findByLeader(leader);
	}

	@Override
	public List<Recrue> getallRecruesBySports(String sport) {
		return recrueRepository.findAllBySports(sport);
	}

}
