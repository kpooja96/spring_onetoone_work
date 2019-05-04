package com.capgemini.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int pid;
	private String pname;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(unique = true)
	private Profile profile;

	public Person() {

	}

	public Person(int pid, String pname, Profile profile2) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.profile = profile2;
	}

	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", profile=" + profile + "]";
	}

	

}
