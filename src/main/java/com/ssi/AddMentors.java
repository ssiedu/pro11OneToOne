package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddMentors {

	public static void main(String[] args) {
		Session session=Data.getSF().openSession();
		Mentor m1=new Mentor("M111","AAA","CS","ME");
		Mentor m2=new Mentor("M112","BBB","Mech","MTech");
		Mentor m3=new Mentor("M113","CCC","Civil","Phd");
		Transaction tr=session.beginTransaction();
		session.save(m1); session.save(m2); session.save(m3);
		tr.commit();
		System.out.println("Mentors Data Stored Successfully");
		session.close();

	}

}
