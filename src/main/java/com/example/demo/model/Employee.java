package com.example.demo.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Employee {
	@PrimaryKey
	  private int empid;
	  private String empcity;
	  private String empname;
	  private int empsal;
	  public Employee() {
		  
	  }
	  public Employee(int empid, String empcity, String empname, int empsal) {
			this.empid = empid;
			this.empcity = empcity;
			this.empname = empname;
			this.empsal = empsal;
		}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empcity=" + empcity + ", empname=" + empname +  ", empsal=" + empsal + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
  
}
