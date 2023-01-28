package com.belbiz.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belbiz.sms.entity.Student;
//student repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
