package com.realtionship.Hibernate_MTM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {

		Emp e1 = new Emp();
		e1.setEid(101);
		e1.setEname("Berlin");
		Emp e2 = new Emp();
		e2.setEid(102);
		e2.setEname("Narobi");

		Project p1 = new Project();
		p1.setPid(1215);
		p1.setProjectname("libary Management System");

		Project p2 = new Project();
		p2.setPid(1216);
		p2.setProjectname("Transport  Management System");

		List<Emp> list1 = new ArrayList<Emp>();
		list1.add(e1);
		list1.add(e2);

		List<Project> list2 = new ArrayList<Project>();
		list2.add(p1);
		list2.add(p2);

		e1.setProject(list2);
		p1.setEmp(list1);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
	}
}
