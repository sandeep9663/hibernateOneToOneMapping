package com.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoForOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("s");
		Configuration con = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();

		System.out.println("start coonection");

		// create Employee
		Employee e1 = new Employee();
		e1.setEmployeeid(1);
		e1.setEmployeename("Ram");

		// Create Department
		Department d1 = new Department();
		d1.setDepartmentid(44);
		d1.setDepartmentname("Software");
		d1.setEmployee(e1);
		e1.setDepartment(d1);
		

		Employee e2 = new Employee();
		e2.setEmployeeid(2);
		e2.setEmployeename("lakhan");
		
		// Create Department
		Department d2 = new Department();
		d2.setDepartmentid(55);
		d2.setDepartmentname("Tester");
		d2.setEmployee(e2);
		e2.setDepartment(d2);

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.save(e1);
		s.save(e2);
		s.save(d1);
		s.save(d2);
		t.commit();
		


		
		//fecthing data
		Employee ans = (Employee) s.get(Employee.class, 2);
		System.out.println(ans.getEmployeename());
		System.out.println(ans.getDepartment().getDepartmentname());
				
		s.close();
		sf.close();
		
	}

}
