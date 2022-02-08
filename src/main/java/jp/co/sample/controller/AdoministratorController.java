package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.InsertAdoministratorForm;
import jp.co.sample.service.AdoministratorService;

@Controller
@RequestMapping("/")
public class AdoministratorController {
	
	@Autowired
	private AdoministratorService adoministratorService;
	
	@ModelAttribute 
	public InsertAdoministratorForm setUpInsertAdministratorForm() {
		return new InsertAdoministratorForm();
	}
	
	
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "administrator/insert";
	}
}
