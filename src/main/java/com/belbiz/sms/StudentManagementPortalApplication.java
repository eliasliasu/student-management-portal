package com.belbiz.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belbiz.sms.entity.Student;
import com.belbiz.sms.repository.StudentRepository;
import com.belbiz.sms.service.StudentService;

@SpringBootApplication
public class StudentManagementPortalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementPortalApplication.class, args);
	}
	
//	@Autowired
//	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
//		Student st1 = new Student("Elias", "Liasu", "elly@gmail.com");
//		studentRepository.save(st1);
//		
//		Student st2 = new Student("Tunde", "Liasu", "tuns@yahoo.com");
//		studentRepository.save(st2);
//		
//		
//		Student st3 = new Student("Mary", "Adetutu", "marytutu@gmail.com");
//		studentRepository.save(st3);
		
	}

}
