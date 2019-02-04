package com.ssi;

import org.hibernate.Session;

public class SearchStud {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Stud s=session.get(Stud.class, 101);
		System.out.println(s.getRno());
		System.out.println(s.getSname());
		System.out.println(s.getMentor().getMname());
		System.out.println(s.getMentor().getQualfication());
/*		Mentor m=s.getMentor();
		System.out.println(m.getMname());
		System.out.println(m.getQualfication());
*/		session.close();
	}

}
