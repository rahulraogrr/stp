package com.example.user.vo;

public class Department {
	
	private Long id;
	private String deptCode;
	private String deptName;
	private String deptAddress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	
	public Department(Long id, String deptCode, String deptName, String deptAddress) {
		super();
		this.id = id;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
	}
	
	public Department() {
		
	}
}
