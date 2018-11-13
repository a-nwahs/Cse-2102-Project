import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
	public ArrayList<String[]> database;							
	public Map <String, Integer> converter;							

	public static void main (String[] args) throws IOException {
		Database db = new Database();
		System.out.println(db.location("70006"));
		//db.printer();
		
	}
	
	public Database () throws IOException { 
		database = new ArrayList<String[]>();						// database sorts the information of each hospital 
		converter = new HashMap<String, Integer>();					// converter is where all the hospital ids are paired to an index of the ArrayList
		int index = 0;
		String file_path = "HospitalGeneralInformation.csv";
	    File file = new File(file_path);
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line;
	    line = reader.readLine(); 									// this is the first line in the file is the header of the csv file
	    
	    while ((line = reader.readLine()) != null) {
	    	String content[] = line.split(",");						// each line from the csv file is sorted within an array, which is used to easily access and mutate its elements
	    	converter.put(content[0], index);						// converter is filled with the hospital ids and their locations in the ArrayList
	    	index++;
	    	for (int i = 8; i < content.length; i++) {
	    		if (content[i].equals("Not Available")) {
	    			content[i] = "-1";
	    		}
	    		if (content[i].equals("Critical Access Hospitals")) {
	    			content[i] = "C";
	    		}
	    		if (content[i].equals("Acute Care Hospitals")) {
	    			content[i] = "A";
	    		}
	    		if (content[i].equals("Childrens")) {
	    			content[i] = "H";
	    		}
	    		if (content[i].equals("Government - Local")) {
	    			content[i] = "GL";
	    		}
	    		if (content[i].equals("Government - Federal")) {
	    			content[i] = "GF";
	    		}
	    		if (content[i].equals("Government - State")) {
	    			content[i] = "GF";
	    		}
	    		if (content[i].equals("Government - Hospital District or Authority")) {
	    			content[i] = "GH";
	    		}
	    		if (content[i].equals("Voluntary non-profit - Private")) {
	    			content[i] = "VP";
	    		}
	    		if (content[i].equals("Voluntary non-profit - Church")) {
	    			content[i] = "VC";
	    		}
	    		if (content[i].equals("Voluntary non-profit - Other")) {
	    			content[i] = "VO";
	    		}
	    		if (content[i].equals("Tribal")) {
	    			content[i] = "T";
	    		}
	    		if (content[i].equals("Physician")) {
	    			content[i] = "Ph";
	    		}
	    		if (content[i].equals("Proprietary")) {
	    			content[i] = "Pr";
	    		}
	    		if (content[i].equals("Yes")) {
	    			content[i] = "Y";
	    		}
	    		if (content[i].equals("No")) {
	    			content[i] = "N";
	    		}
	    		if (content[i].equals("")) {
	    			content[i] = "n/a";
	    		}
	    		if (content[i].equals("Below the national average")) {
		    		content[i] = "B";
		    	}
		    	if (content[i].equals("Above the national average")) {
		    		content[i] = "A"; 
		    	}	
		    	if (content[i].equals("Same as the national average")) {
		    		content[i] = "S";
		    	}
	    	}
	    	database.add(content); 								// appends an altered line from the excel sheet into the ArrayList db 
	    }
	    reader.close();
	}
	
	public void printer() {
		for (int i = 0; i < database.size(); i++) {
			for (String str: database.get(i)) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
	
	public String[] lookup(String id) {							// returns the hospital information that is related to a specific hospital id
		return database.get(converter.get(id));
	}
	
	public String location(String id) { 
		String address = "";
		for (int i = 2; i < 6; i++) {
			address.concat(" " + database.get(converter.get(id))[i]);
		}
		return address;
	}
}

