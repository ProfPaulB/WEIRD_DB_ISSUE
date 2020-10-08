package ca.sheridancollege.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.database.DatabaseAccess;

@Controller
public class StudentController {

	@Autowired
	private DatabaseAccess da;

//	@Autowired
//	public void setDatabaseAccess(DatabaseAccess da) {
//		this.da = da;
//	}
	
	@GetMapping("/")
	public String goToHome() {
		da.insertStudent();
		return "index";
	}
	
}
