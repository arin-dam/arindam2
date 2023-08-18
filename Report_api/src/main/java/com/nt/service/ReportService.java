package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.enitity.EligibilityDetailsRepo;

public class ReportService implements EligibilityService {
	@Autowired
	private EligibilityDetailsRepo eligRepo;

	@Override
	public List<String> getUniquePlanName() {
		
		return eligRepo.findplanStaus();
	}

	@Override
	public List<String> getUniqueplanStaus() {
		// TODO Auto-generated method stub
		return eligRepo.findplanStaus();
	}

	@Override
	public void generateExcel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generatePdf() {
		// TODO Auto-generated method stub

	}

}
