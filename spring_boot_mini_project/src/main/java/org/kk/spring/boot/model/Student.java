package org.kk.spring.boot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "STUDENT_TAB")
public class Student {

	@Id
	@Column (name = "st_id")
	@GeneratedValue
	private Integer sid;
	
	@Column (name = "roll_number",unique = true)
	private String rollNo;
	
	@Column (name = "st_name")
	private String sname;
	
	@Column (name = "age")
	private Integer age;
	
	@Column (name = "fees")
	private Double fees;
}
