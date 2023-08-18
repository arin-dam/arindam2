package com.nt.service;

import java.util.List;

public interface EligibilityService {
	public List<String>getUniquePlanName();
	public List<String>getUniqueplanStaus();
	public void generateExcel();
	public void generatePdf();

}
