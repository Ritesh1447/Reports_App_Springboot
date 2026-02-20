package com.nt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.Service.IReportService;

@Controller
public class ReportController {

	@Autowired
	private IReportService service;
}
