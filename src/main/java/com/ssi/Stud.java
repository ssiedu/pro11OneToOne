package com.ssi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stud {
	@Id
	private int rno;
	private String sname;
	@OneToOne(fetch=FetchType.LAZY)
	private Mentor mentor;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	public Stud(int rno, String sname, Mentor mentor) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.mentor = mentor;
	}
	public Stud(int rno) {
		super();
		this.rno = rno;
	}
	public Stud() {
		super();
	}
	@Override
	public String toString() {
		return "Stud [rno=" + rno + ", sname=" + sname + ", mentor=" + mentor
				+ "]";
	}
	
	
}
