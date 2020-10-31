package basePackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import util.MultiMap;

/**
 * Class to be used to make diagraph
 */
public class DiagraphMaker {

	/**
	 * Transform a array of words in a diagraph multimap.
	 * @param words string array of words already treated
	 * @return a multimap in a diagraph format, made of the given string array.
	 */
	public MultiMap<String, String> makeDiagraph(String[] words) {
		MultiMap<String, String> mm = new MultiMap<>();

		/*Add key-value to the multimap */
		for (int i = 0; i < words.length-1; i++) {
			mm.add(words[i], words[i+1]);
		}
		return mm;
	}
	
	/**
	 * Transforms a multimap that is already a diagraph in a string, 
	 * with the correct formatting for be used in Gephi app.
	 * @param mm the multimap with diagraph mapped
	 * @param separator the char that will separate each of the values
	 * @return the mutimap converted to a single string
	 */
	public String diagraphToString(MultiMap<String, String> mm, char separator) {
		/*Get the keys from the multimap */
		ArrayList<String> keys = new ArrayList<>();
		keys.addAll(mm.getKeys());

		/*Order the list*/
		Collections.sort(keys);
		
	    StringBuilder sb = new StringBuilder();
	    /*Loop the vetor that is ordered and write int the file the keys and values of the multimap*/
	    for(String key : keys) {
	    	sb.append(key);
    		Collection<String> values = mm.get(key);
	    	for(String value : values) {
	    		sb.append(separator + value);
	    	}
	    	sb.append('\n');
	    }
	    
	    return sb.toString();
	}
	
}
