package com.nt.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {
	
	//Form Binding
	private String PlanName;
	private String PlanStatus;
	private String gender;
	private LocalDate startDate;
	private LocalDate endDate;
	

}
