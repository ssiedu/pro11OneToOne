package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mentor {
	@Id
	private String mcode;
	private String mname;
	private String dept;
	private String qualfication;
	@OneToOne(mappedBy="mentor")
	private Stud stud;
	
	public Mentor() {
		super();
	}
	public Mentor(String mcode) {
		super();
		this.mcode = mcode;
	}
	public Mentor(String mcode, String mname, String dept, String qualfication) {
		super();
		this.mcode = mcode;
		this.mname = mname;
		this.dept = dept;
		this.qualfication = qualfication;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getQualfication() {
		return qualfication;
	}
	public void setQualfication(String qualfication) {
		this.qualfication = qualfication;
	}
	@Override
	public String toString() {
		return "Mentor [mcode=" + mcode + ", mname=" + mname + ", dept=" + dept
				+ ", qualfication=" + qualfication + "]";
	}
	public Stud getStud() {
		return stud;
	}
	public void setStud(Stud stud) {
		this.stud = stud;
	}
	
	
	
	
}
