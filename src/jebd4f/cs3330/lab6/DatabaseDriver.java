//Jayme Becker
//Lab 6
//Section A
//3/18/2014
//Submission Code: Will is sicky sicky
//TA: Will Starms

package jebd4f.cs3330.lab6;

public class DatabaseDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fName = "empData.csv";
		
		Database DB = new Database(fName);
		DB.searchMenu();
		
		System.exit(0);
	

	}

}
