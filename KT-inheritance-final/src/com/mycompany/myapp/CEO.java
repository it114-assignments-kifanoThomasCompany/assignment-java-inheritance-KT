/**
 * 
 */
package com.mycompany.myapp;

/**
 * @author Ken
 *
 */
public class CEO extends ProfileInfo implements Working {
	//public class CEO extends (company) ProfileInfo implements Profile {
		private String  title;
		
		public CEO (String _name, Integer _age, String _title) {
			super(_name, _age);
			title = _title;
		}
		
		/* (non-Javadoc)
		 * @see com.mycompany.myapp.mycomponent.Person#getName()
		 */
		@Override
		public String getName() {
			return "CEO: " + super.getName();
		}
		
		public String workingOn() {			 
			return "Monitoring Employees";


	}
}
