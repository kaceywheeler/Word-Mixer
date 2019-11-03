package ifs2;

public class WordMixer {
	public String Mix(String text, int num) {
		String answer;
		int len = text.length();
		
		if (num < len) {
			String sub1 = text.substring(0,num);
			String sub2 = text.substring(num, len);
			answer = sub2 + sub1;
		
		}
		
		else {
			answer = "no can do";
		}
		
		return answer;
	}
}
