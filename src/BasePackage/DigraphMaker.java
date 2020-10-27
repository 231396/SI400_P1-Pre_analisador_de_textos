package basePackage;

import util.MultiMap;

/**
 * Class to be used to make digraph
 */
public class DigraphMaker {

	
	public MultiMap<String, String> made(String[] words) {
		MultiMap<String, String> mm = new MultiMap<>();

		for (int i = 0; i < words.length-1; i++) {
			mm.add(words[i], words[i+1]);
		}
		return mm;
	}
	
}
