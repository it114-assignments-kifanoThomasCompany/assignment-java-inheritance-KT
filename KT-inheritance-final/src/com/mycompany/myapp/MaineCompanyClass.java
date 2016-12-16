/**
 * 
 */
package com.mycompany.myapp;

/**
 * @author Ken
 *
 */
public class MaineCompanyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start work");
		
		Employee e1 = new Employee("John", 31, "Secaucus Loc.", "14434");
		System.out.println("Employee 1 name:" + e1.getName());
		
		CEO p1 = new CEO("Alex", 55, "Tribeck");
		System.out.println("p1 name:" + p1.getName());
		
		Profile person1 = e1;//
		System.out.println("person1 name:" + person1.getName());
		Working working1 = e1;
		System.out.println("working on:" + working1.workingOn());
		
		Profile person2 = new Employee ("Jamal", 25, "Hoboken", "23221");//
		System.out.println("person1 name:" + person2.getName());
		// TODO Auto-generated method stub

	}

}
