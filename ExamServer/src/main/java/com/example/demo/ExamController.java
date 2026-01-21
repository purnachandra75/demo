package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExamController {
	
	 private final StudentClient studentClient;

	    public ExamController(StudentClient studentClient) {
	        this.studentClient = studentClient;
	    }

	    @GetMapping("/student/getstudent")
	    public String getStudentByExam() {
	        return studentClient.getStudents();
	    }
	    
	    

}
