package com.decathlon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.model.Recrue;
import com.decathlon.service.RecrueService;

@RestController
public class RecrueController {

	@Autowired
	private RecrueService recrueService;

	@RequestMapping(value = "/allRecrues", method = RequestMethod.GET, produces = ("application/json"), headers = "accept=application/json")
	public List<Recrue> getallRecrues() {
		return recrueService.getAllRecrues();

	}

	@RequestMapping(value = "/addRecrue", method = RequestMethod.POST, produces = ("application/json"), headers = "accept=application/json")
	public void addRecrue(@RequestBody Recrue recrue) {
		recrueService.save(recrue);
	}

	@RequestMapping(value = "/getByFiliere", method = RequestMethod.GET, produces = ("application/json"), headers = "accept=application/json")
	public List<Recrue> getallRecruesByFiliere(@RequestParam String filiere) {
		return recrueService.getallRecruesByFiliere(filiere);

	}

	@RequestMapping(value = "/getByLeader", method = RequestMethod.GET, produces = ("application/json"), headers = "accept=application/json")
	public List<Recrue> getallRecruesByLeader(@RequestParam String leader) {
		return recrueService.getallRecruesByLeader(leader);

	}

	@RequestMapping(value = "/getBySport", method = RequestMethod.GET, produces = ("application/json"), headers = "accept=application/json")
	public List<Recrue> getallRecruesBySports(@RequestParam String sport) {
		return recrueService.getallRecruesBySports(sport);

	}
}
