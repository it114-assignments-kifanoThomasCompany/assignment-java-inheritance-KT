/**
 * 
 */
package com.mycompany.myapp;

/**
 * @author Ken
 *
 */
public class Employee extends ProfileInfo implements  Working{

	
	private String status;
	private String id;
	
	public Employee() {
		super("John", 31);
	}

	public Employee(String _name, Integer _age) {
		super(_name, _age);
	} 
	
	public Employee(String _name, Integer _age, String _status) {
		this(_name, _age); 
		status = _status;
	}	
	
	public Employee(String _name, Integer _age, String _status, String _id) {
		this(_name, _age, _status);
		id = _id;
	}
	
	/**
	 * 
	 */
//	@Override
	public String getName(String _name, Integer _age) {
		return name;
	}
	
	public String getName(String _lastName) {
		return name + _lastName;
	}

	 
	@Override
	public Integer getAge() {
		return age;
	}

	@Override
	public String workingOn() {
		// TODO Auto-generated method stub
		return "Sales report";
	}

}
