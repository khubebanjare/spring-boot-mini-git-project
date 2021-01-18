package org.kk.spring.boot.service.impl;

import java.util.List;

import org.kk.spring.boot.model.Student;
import org.kk.spring.boot.repository.StudentRepositroy;
import org.kk.spring.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepositroy studentRepository;
	
	@Transactional
	public Integer saveStudent(Student student) {
		return studentRepository.save(student).getSid();
		/*
		student = studentRepository.save(student);
		return student.getSid();
		 */
	}

	@Transactional (readOnly = true)
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@CacheEvict (value = "student-cache", key = "sid")
	@Transactional
	public void deleteStudent(Integer sid) {
		studentRepository.deleteById(sid);
		
	}

	@Cacheable (value = "student-cache", key = "sid")
	@Transactional (readOnly = true)
	public Student getStudentById(Integer sid) {
		return studentRepository.getOne(sid);
	}

	@CachePut (value = "student-cache", key = "sid")
	@Transactional 
	public void studentUpdate(Student student) {
		studentRepository.save(student);
	}

}
