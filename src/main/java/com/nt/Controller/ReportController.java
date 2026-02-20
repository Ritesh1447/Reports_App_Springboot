package com.nt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Service.IReportService;
import com.nt.entity.CitizenPlan;
import com.nt.request.SearchRequest;

@Controller
public class ReportController {

	@Autowired
	private IReportService service;
	
	@GetMapping("/")
	public String indexPage(Model model) {

		
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("search", new  SearchRequest());
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatuses());
	}
	
		@PostMapping("/search")
	public String HandleSearh( SearchRequest request,Model model) {
			List<CitizenPlan> plans=service.search(request);
			model.addAttribute("plans", plans);
			init(model);
		return "index";
	}
}
