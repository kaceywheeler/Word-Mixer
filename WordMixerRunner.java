package ifs2;
import java.util.Scanner;
import ifs2.WordMixer;

public class WordMixerRunner {
	public static void main (String args[] ) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String text = keyboard.next();
		
		System.out.println("Enter an integer: ");
		int num = keyboard.nextInt();
		
		WordMixer ref = new WordMixer();
		
		System.out.println(ref.Mix(text,num));
		

}
}