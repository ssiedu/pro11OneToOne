package com.ssi;

import org.hibernate.Session;

public class SearchMentor {

	public static void main(String[] args) {
		Session session=Data.getSF().openSession();
		Mentor m=session.get(Mentor.class, "M111");
		System.out.println(m.getMcode());
		System.out.println(m.getMname());
		System.out.println(m.getDept());
		System.out.println(m.getQualfication());
		System.out.println(m.getStud().getRno());
		System.out.println(m.getStud().getSname());
		session.close();
	}

}
