//Jayme Becker
//Lab 6
//Section A
//3/18/2014
//Submission Code: Will is sicky sicky
//TA: Will Starms

package jebd4f.cs3330.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;


public class Database {
	//declare instance varaibles
	private HashMap<String, Employee> empDB;
	private int counter;
	private static Scanner userinput;
	
	//constructor
	public Database(String fileName)
	{
		importFile(fileName);
		userinput = new Scanner(System.in);
	}
	
	//searchMenu to search the menu for values
	public void searchMenu()
	{
		//Search the database and return the value, create a result arraylist of type employee, create an iterator and declare a new scanner
		ArrayList<Employee> result = new ArrayList<Employee>();
		
		System.out.println("Please enter your query (q to exit): ");
		String query = userinput.nextLine();
		
		//while loop until the user quits out of program
		while(!query.equals("q"))
		{
			result = searchDatabase(query);
			//print out results
			if(result == null)
			{
				System.out.println("Search found no match.");
			}
			else
			{
				int i;
				System.out.println("Results:\n ");
				for(i = 0; i< result.size(); i++)
				{
					System.out.println((i+1) + "- " + result.get(i).getName());
				
				}
			}
			
			//get more user input
			System.out.println("Please enter your query (q to exit): ");
			query = userinput.nextLine();
		}
		
		//End program
		System.out.println("Program Complete");
		userinput.close();
	}
	
	//importFile method to import the file
	protected void importFile(String empFileName)
	{
		//instantiate the file class and read in the file and scanner class
		File empFile = new File(empFileName);
		Scanner dataScanner = null;
		
		//instantiate hashmap
		 empDB = new HashMap<String, Employee>();

		
		//try/catch/finally to open the file and put stuff in it
		try
		{
				dataScanner = new Scanner(empFile);
				
				while(dataScanner.hasNext())
				{
					//break out of while loop if
					if(counter > 9)
					{
						break;
					}
					
					String employee = dataScanner.nextLine();
					String[] data = employee.split(",");
					String type = data[0];
					
					if(type.equals("CEO"))
					{
						String name = data[1];
						int SSN = Integer.parseInt(data[2]);
						int netWorth = Integer.parseInt(data[3]);
						
						String key = type.concat("CEO " + name);
						
						empDB.put(key, new CEO(name, SSN, netWorth));
												
					}
					else if(type.equals("Developer"))
					{
						String name = data[1];
						int SSN = Integer.parseInt(data[2]);
						String langProf = data[3];
						
						String key = type.concat("Developer " + name);
						empDB.put(key, new Developer(name, SSN, langProf));
					}
					else if(type.equals("Manager"))
					{ 
							String Name = data[1];
							int SSN = Integer.parseInt(data[2]);
							String department = data[3];
							String key = type.concat("Manager " + Name);
					
							empDB.put(key, new Manager(Name, SSN, department));
					}
					
					counter++;
				}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: Employee data file not found.");
			System.exit(0);
		}
		finally
		{
			dataScanner.close();
		}
		
		System.out.println("There are possibluy more data in the file, but we're skipping the rest...");
		System.out.println("Import Complete");
	}
	
	//searchDatabase method to search the database for the specific employee with O(N) complexity for searching the treeMap
	protected ArrayList<Employee> searchDatabase(String emp)
	{
		
				ArrayList <Employee> result = new ArrayList<Employee>();

				//linear search through each key and check if it contains query value (O^n)
				for(Entry<String, Employee> entry: empDB.entrySet())
				{
					if (entry.getKey().toLowerCase().contains(emp.toLowerCase()))
					{
						result.add(empDB.get(entry.getValue()));
					
					}
				}
	
				return result;
	}
	

}
