//Jayme Becker
//Lab 6
//Section A
//3/18/2014
//Submission Code: Will is sicky sicky
//TA: Will Starms

package jebd4f.cs3330.lab6;

public class Employee {
		private String name;
		private int SSN;
		
		//constructor that takes in a name and DOB and calls the set methods
		public Employee(String name,int SSN)
		{
			setName(name);
			setSSN(SSN);
		}
		
		//setName method to set the name
		protected void setName(String name)
		{
			this.name = name; 
		}
		
		//setDOB method to set the DOB
		protected void setSSN(int SSN)
		{
			this.SSN = SSN; 
		}
		
		//getName method to get the name
		public String getName()
		{
			return this.name; 
		}
		
		//getDOB method to get the DOB
		public int getSSN()
		{
			return this.SSN; 
		}
	}
