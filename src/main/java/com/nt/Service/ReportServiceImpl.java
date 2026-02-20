package com.nt.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.entity.CitizenPlan;
import com.nt.repo.CitizenPlanRepository;
import com.nt.request.SearchRequest;
@Service
public class ReportServiceImpl implements IReportService {
	
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public List<String> getPlanNames() {
      List<String> planNames=repo.getPlanNames();
		return  planNames;
	}

	@Override
	public List<String> getPlanStatuses() {
  List<String> planStatus=repo.getPlanStatus();
		return planStatus;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
	   CitizenPlan entity=new CitizenPlan();
    if(null !=request.getPlanName() && !"".equals(request.getPlanName())) {
	entity.setPlanName(request.getPlanName());
    }
    if(null !=request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
    	entity.setPlanStatus(request.getPlanStatus());
        }
    if(null !=request.getGender() && !"".equals(request.getGender())) {
    	entity.setGender(request.getGender());
        }
    
    if(null !=request.getStartDate() && !"".equals(request.getStartDate())) {
    	String startDate=request.getStartDate();
    	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	//String to LocalDate
    	LocalDate localDate=LocalDate.parse(startDate, formatter);
    	entity.setPlanStartDate(localDate);
    }
    	
        
		return repo.findAll(Example.of(entity));
	}
	
	

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
