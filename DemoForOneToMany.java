package com.oneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	//	 create Employee
		Employee e1 = new Employee();
		e1.setEmployeeid(2);
		e1.setEmployeename("Ram");

		// Create Department
		Department d1 = new Department();
		d1.setDepartmentid(44);
		d1.setDepartmentname("Software");
		d1.setEmployee(e1);
		
		
		// Create Department
		Department d2 = new Department();
		d2.setDepartmentid(55);
		d2.setDepartmentname("Tester");
		d2.setEmployee(e1);
		
		Department d3 = new Department();
		d3.setDepartmentid(56);
		d3.setDepartmentname("FrantEnd");
		d3.setEmployee(e1);
		
		List<Department> set= new ArrayList();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(e1);
		s.save(d1);
		s.save(d2);
		s.save(d3);

		t.commit();
		


		
		//fecthing data
		Employee e=(Employee)s.get(Employee.class, 2);
		System.out.println(e.getEmployeename());
		for(Department d:e.getDepartment())
		{
			System.out.println(d.getDepartmentid());
		}
		
		
						
		s.close();
		sf.close();
		
			
		
		
	}

}





