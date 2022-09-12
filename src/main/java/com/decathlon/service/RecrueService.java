package com.decathlon.service;

import java.util.List;

import com.decathlon.model.Recrue;

public interface RecrueService {

	public List<Recrue> getAllRecrues();

	public void save(Recrue recrue);

	public List<Recrue> getallRecruesByFiliere(String filiere);

	public List<Recrue> getallRecruesByLeader(String leader);

	public List<Recrue> getallRecruesBySports(String sport);

}
