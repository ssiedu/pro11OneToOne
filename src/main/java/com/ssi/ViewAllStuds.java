package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ViewAllStuds {
	public static void main(String[] args) {

		Session session = Data.getSF().openSession();
		Criteria cr=session.createCriteria(Stud.class);
		List<Stud> list=cr.list();
		for(Stud s:list){
			System.out.println(s.getRno());
			System.out.println(s.getSname());
			//System.out.println(s.getMentor());
		}
		session.close();
	}
}
