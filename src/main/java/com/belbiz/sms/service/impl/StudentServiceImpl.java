package com.belbiz.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belbiz.sms.entity.Student;
import com.belbiz.sms.repository.StudentRepository;
import com.belbiz.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	public StudentServiceImpl(StudentRepository studentRepository) {
//		super();
//		this.studentRepository = studentRepository;
//	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.getReferenceById(id);
	}


	@Override
	public Student updateStudent(Student student) {
		Student stdt = new Student();
		try {			
			 stdt = getStudentById(student.getId());
			if (stdt != null) {
				stdt = studentRepository.save(student);
				
			}
			
		} catch (Exception e) {
			System.out.println("error updating student");
		}
		
		return stdt;
	}


	@Override
	public void deleteStudentById(Long id) {
		
		Student stdnt = new Student();
		
		try {
			stdnt = studentRepository.getReferenceById(id);
			if (stdnt != null) {
				studentRepository.deleteById(id);
			}
		} catch (Exception e) {
			System.out.println("Error deleting student");
		}
		
	}

}
