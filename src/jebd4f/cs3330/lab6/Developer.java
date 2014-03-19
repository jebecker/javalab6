//Jayme Becker
//Lab 6
//Section A
//3/18/2014
//Submission Code: Will is sicky sicky
//TA: Will Starms

package jebd4f.cs3330.lab6;

public class Developer extends Employee{
		//declare instance varialbes
		private String langProf;
		
		//constructor that calls the superclass's constructor 
		public Developer(String name,int SSN,String langProf)
		{
			super(name,SSN);
			setLangProf(langProf);
		}
		
		//getSkill method to get the skill
		public String getLangProf() 
		{
			return this.langProf; 
		}
		
		//protected setSkill method to set the skill and only this class and the superclass can access it
		protected void setLangProf(String langProf) 
		{
			this.langProf = langProf; 
		}
		
		//override the toString method to print data
		@Override
		public String toString()
		{
			return "Developer " + super.getName() + "\n\tSSN: " + super.getSSN() + "\n\tLanguage Prof: " + this.getLangProf();
		}
		
}
