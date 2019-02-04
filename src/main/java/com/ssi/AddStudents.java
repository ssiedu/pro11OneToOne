package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddStudents {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();

		Stud s1=new Stud();
		s1.setRno(101);
		s1.setSname("XYZ");
		s1.setMentor(new Mentor("M111"));
		Stud s2=new Stud(102,"PQR",new Mentor("M112"));
		Stud s3=new Stud(103,"MNO",new Mentor("M113"));
		session.save(s1); session.save(s2); session.save(s3);
		tr.commit();
		System.out.println("Students Data Stored Successfully");
		session.close();

	}

}
