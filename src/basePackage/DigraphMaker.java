package basePackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import util.MultiMap;

/**
 * Class to be used to make digraph
 */
public class DigraphMaker {

	
	public MultiMap<String, String> madeDiagraph(String[] words) {
		MultiMap<String, String> mm = new MultiMap<>();

		/*Add key-value to the multimap */
		for (int i = 0; i < words.length-1; i++) {
			mm.add(words[i], words[i+1]);
		}
		return mm;
	}
	
	public String diagraphToString(MultiMap<String, String> mm) {
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
	    		sb.append(',' + value);
	    	}
	    	sb.append('\n');
	    }
	    
	    return sb.toString();
	}
	
}
