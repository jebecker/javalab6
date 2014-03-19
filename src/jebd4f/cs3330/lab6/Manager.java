//Jayme Becker
//Lab 6
//Section A
//3/18/2014
//Submission Code: Will is sicky sicky
//TA: Will Starms

package jebd4f.cs3330.lab6;


//middle tier goon
public class Manager extends Employee {
	//declare instance variables
	private String department;
	
	//constructor that calls the super constructor and the set methods
	public Manager(String name, int SSN, String department)
	{
		super(name, SSN);
		this.setDepartment(department);
		
	}
	
	//getSector method to get the sector
	public String getDepartment()
	{
		return this.department;
	}
	
	//protected setSector method to set the sector
	protected void setDepartment(String department)
	{
		this.department = department;
	}	
	
	//override the toString method to print data
	@Override
	public String toString()
	{
		return "Manager " + super.getName() + "\n\tSSN: " + super.getSSN() + "\n\tDepartment: " + this.getDepartment();
	}
}