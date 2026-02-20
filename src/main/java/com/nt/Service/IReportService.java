package com.nt.Service;

import java.util.List;

import com.nt.entity.CitizenPlan;
import com.nt.request.SearchRequest;

public interface IReportService {
	
 public List<String> getPlanNames();
 
 public List<String> getPlanStatuses();
 
 public List<CitizenPlan> search(SearchRequest request);
 
 public boolean exportExcel();
 
 public boolean exportPdf();
 
}
