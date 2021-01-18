package org.kk.spring.boot.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "college_tab")
public class College {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private String collegeId;
	private String collegeName;
	private String collegeCode;
	private String collegeAddress;
	private String phoneNo;
	private String discription;
	private Map<String, Object> branches;
}
