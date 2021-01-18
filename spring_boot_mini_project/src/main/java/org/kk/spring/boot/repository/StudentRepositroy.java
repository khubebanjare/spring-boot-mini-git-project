package org.kk.spring.boot.repository;


import org.kk.spring.boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositroy extends JpaRepository<Student, Integer>, CrudRepository<Student, Integer>{
	
	
}
