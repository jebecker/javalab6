//Jayme Becker
//Lab 6
//Section A
//3/18/2014
//Submission Code: Will is sicky sicky
//TA: Will Starms

package jebd4f.cs3330.lab6;

//highest tier goon
public class CEO extends Employee {
	//declare instance variables
	int netWorth;
	
	//contructor that calls the superclass's constructor and the set methods
	public CEO(String name,int SSN, int netWorth)
	{
		super(name,SSN);
		this.setNetWorth(netWorth);		
	}
	
	//getNetWorth method to get the net worth of the don goon
	public int getNetWorth()
	{
		return this.netWorth;
	}
	
	//protected setNetWorth method set the newWorth
	protected void setNetWorth(int netWorth)
	{
		this.netWorth = netWorth;
	}
	
	//override the toString method to print data
			@Override
			public String toString()
			{
				return "CEO " + super.getName() + "\n\tSSN: " + super.getSSN() + "\n\t Net Worth: " + this.getNetWorth();
			}
}
