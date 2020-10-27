package basePackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import util.MultiMap;

public class TextWriter {

	private MultiMap<String, String> multimap;

	public TextWriter(MultiMap<String, String> multimap) {
		this.multimap = multimap;
	}

	public boolean Write(String fileName) throws IOException {

		/*Check if the element is null to avoid NullPointerException*/
		if(multimap == null) {
			return false;
		}

		/*Get the keys from the multimap */
		ArrayList<String> keys = new ArrayList<>();
		keys.addAll(multimap.getKeys());

		/*Order the list*/
		Collections.sort(keys);
		
		/*Create a PrintWriter to write in the file*/
		FileWriter fileWriter = new FileWriter(fileName+".csv");
	    PrintWriter printWriter = new PrintWriter(fileWriter);
		
	    /*Loop the vetor that is ordered and write int the file the keys and values of the multimap*/
	    for(String key : keys) {
    		printWriter.printf("%s",key);
    		Collection<String> values = multimap.get(key);
	    	for(String value : values) {
	    		printWriter.printf(",%s",value);
	    	}
	    	printWriter.print("\n");
	    }
		
	    /*Close and save the file*/
		printWriter.close();

		return true;
	}

}