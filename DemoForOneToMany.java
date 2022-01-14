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
		System.out.println("start");
		Configuration con = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();

		System.out.println("start coonection");

	//	 create Employee
//		Employee e1 = new Employee();
//		e1.setEmployeeid(2);
//		e1.setEmployeename("Sham");
//
//		// Create Department
//		Department d1 = new Department();
//		d1.setDepartmentid(99);
//		d1.setDepartmentname("Software");
//		d1.setEmployee(e1);
//		
//		
//		// Create Department
//		Department d2 = new Department();
//		d2.setDepartmentid(100);
//		d2.setDepartmentname("Tester");
//		d2.setEmployee(e1);
//		
//		Department d3 = new Department();
//		d3.setDepartmentid(101);
//		d3.setDepartmentname("FrantEnd");
//		d3.setEmployee(e1);
//		
//		List<Department> set= new ArrayList<Department>();
//		set.add(d1);
//		set.add(d2);
//		set.add(d3);
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		s.save(e1);
//		s.save(d1);
//		s.save(d2);
//		s.save(d3);

		t.commit();
		


		
//		//fecthing data by 
		Employee e=(Employee)s.get(Employee.class, 1);
//		System.out.println(e.getEmployeeid());
//		System.out.println(e.getEmployeename());
//		System.out.println(e.getEmployeeid());
//		// perform operation on object that time return origional object!!!!!!!! that means default fetch type is lazy loading
//		for(Department d:e.getDepartment())
//		{
//			System.out.println(d.getDepartmentid());
//		}
		
		//fecthing data by Eager loading
				
				System.out.println(e.getEmployeeid());
				System.out.println(e.getEmployeename());
				
				
				System.out.println(e.getDepartment().size());
				
		
		
						
		s.close();
		sf.close();
		
			
		
		
	}

}





