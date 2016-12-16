/**
 * 
 */
package com.mycompany.myapp;

/**
 * @author Ken
 *
 */
public abstract class ProfileInfo implements Profile {
	protected String  name;
	protected Integer age;
	
	public ProfileInfo(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public ProfileInfo() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getAge() {
		return age;
	}

}
