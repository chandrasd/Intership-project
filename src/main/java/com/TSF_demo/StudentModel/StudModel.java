package com.TSF_demo.StudentModel;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StuData")
public class StudModel {  
	
	@Id
	@Column(name = "Id")
	private long id; 
	
	@Column(name = "Name")
	private String name;    
	@Column(name = "Pointer")
	private double pointer;  
	
	public StudModel()
	{
		
	}
	public StudModel(long id,String name, double pointer) {
		this.id = id;
		this.name = name;
		this.pointer = pointer;
	}
	
	public long getId() {    
	    return id;    
	}    
	public void setId(long l) {    
	    this.id = l;    
	}    
	public String getName() {    
	    return name;    
	}    
	public void setName(String name) {    
	    this.name = name;    
	}
	public double getPointer() {
		return pointer;
	}
	public void setPointer(double pointer) {
		this.pointer = pointer;
	}
}    