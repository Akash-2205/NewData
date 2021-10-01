package com.realtionship.Hibernate_MTM;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String projectname;
	@ManyToMany
	private List<Emp> Emp;

	public Project() {
		super();

	}

	public Project(int pid, String projectname, List<com.realtionship.Hibernate_MTM.Emp> emp) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		Emp = emp;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Emp> getEmp() {
		return Emp;
	}

	public void setEmp(List<Emp> emp) {
		Emp = emp;
	}

}
