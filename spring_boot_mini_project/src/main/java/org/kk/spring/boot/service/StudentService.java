package org.kk.spring.boot.service;

import java.util.List;

import org.kk.spring.boot.model.Student;

public interface StudentService {

	public Integer saveStudent(Student student);
	public List<Student> getAllStudents();
	public void deleteStudent(Integer sid);
	public Student getStudentById(Integer sid);
	public void studentUpdate(Student student);
}
