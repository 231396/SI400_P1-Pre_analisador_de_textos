package basePackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public  class TextReader {

	public static String reader(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String line = "";
		while (line != null) {		
			sb.append(line);
			line = buffRead.readLine();
		}		
		buffRead.close();
		return sb.toString();
	}

	
	public String treatText(String str) {		
		str = str.replaceAll("\n", " ")
				.replaceAll("\r", "")
				.replaceAll("[\\.\\!\\?\\,\\(\\)\\$\\[\\]\\:\\;\\\"\\*\\/\\\\\\–\\–\\@]", "")
				.toLowerCase();
		return str;
	}
	
	public String[] stringToWords(String str) {
		return str.split(" +");
	}
	
}
