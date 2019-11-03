package ifs2;

public class WordMixer {
	public String Mix(String text, int num) {
		String answer;
		//Save length of string as variable
		int len = text.length();
		
		//Makes sure that the index trying to be used is not bigger than the length of the text
		if (num < len) {
			//Creates substring from the beginning to the number
			String sub1 = text.substring(0,num);
			//Creates substring of remaining characters
			String sub2 = text.substring(num, len);
			//Adds substrings together to make new string in reverse order
			answer = sub2 + sub1;
		
		}
		
		//Prints no can do if the number is outside of the length of the string
		else {
			answer = "no can do";
		}
		
		//Return new string 
		return answer;
	}
}
