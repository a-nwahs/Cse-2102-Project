import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Database {
	public ArrayList<String[]> database;

	public static void main (String[] args) throws IOException {
		Database db = new Database();
	}
	
	public Database () throws IOException { 
		database = new ArrayList<String[]>();
		String file_path = "HospitalGeneralInformation.csv";
	    File file = new File(file_path);
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line;
	    line = reader.readLine(); // this first line in the file is the header of the excel file
	   
	    while ((line = reader.readLine()) != null) {
	    	String content[] = line.split(",");
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
	    	System.out.println(Arrays.toString(content));
	    	database.add(content); // print out the contents of a single line
	    }
	    /* Implementing Use Case functionality 
	     	searching by location
	     		convert the locations to coordinates
	    */
	    reader.close();
	}
}

