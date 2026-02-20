package com.nt.Runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CitizenPlan;
import com.nt.repo.CitizenPlanRepository;
@Component
public class DataLoader implements CommandLineRunner{
	
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		
		
		//Cash plan Data
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("Ritesh");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);
		
		
	
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Raju");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setBenefitAmt(5000.00);
		c2.setDenialReason("Rental income");
		
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Kim");
		c3.setGender("Fe-Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationRsn("Employed");
		
		
		//Food plan Data
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("Robert");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(4000.00);
		
		
	
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Berlin");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setBenefitAmt(5000.00);
		c5.setDenialReason("Property income");
		
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Holly");
		c6.setGender("Fe-Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(5000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationRsn("Employed");
		
		//Medical plan Data
		CitizenPlan c7=new CitizenPlan();
		c7.setCitizenName("King");
		c7.setGender("Male");
		c7.setPlanName("medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(5000.00);
		
		
	
		CitizenPlan c8=new CitizenPlan();
		c8.setCitizenName("Lord");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmt(5000.00);
		c8.setDenialReason("Rental income");
		
		
		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("Riya");
		c9.setGender("Fe-Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(5000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationRsn("Govt Job");
		
		//Employment plan Data
		CitizenPlan c10=new CitizenPlan();
		c10.setCitizenName("Butler");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(5000.00);
		
		
	
		CitizenPlan c12=new CitizenPlan();
		c12.setCitizenName("Smit");
		c12.setGender("Male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Denied");
		c12.setPlanStartDate(LocalDate.now());
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(5000.00);
		c12.setDenialReason("Rental income");
		
		
		CitizenPlan c13=new CitizenPlan();
		c13.setCitizenName("Jennie");
		c13.setGender("Fe-Male");
		c13.setPlanName("Employment");
		c13.setPlanStatus("Terminated");
		c13.setPlanStartDate(LocalDate.now().minusMonths(4));
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmt(5000.00);
		c13.setTerminatedDate(LocalDate.now());
		c13.setTerminationRsn("Employed");
		
		List<CitizenPlan> list=Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c12,c13);
		repo.saveAll(list);
	}
	}
	
	


