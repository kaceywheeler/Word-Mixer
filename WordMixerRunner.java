package ifs2;
//Import scanner
import java.util.Scanner;
//Import WordMixer class
import ifs2.WordMixer;

public class WordMixerRunner {
	public static void main (String args[] ) {
		
		//Create new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get user input for text
		System.out.println("Enter a string: ");
		String text = keyboard.next();
		
		//Get user input for num
		System.out.println("Enter an integer: ");
		int num = keyboard.nextInt();
		
		//Create new WordMixer object
		WordMixer ref = new WordMixer();
		
		//Call method and print output
		System.out.println(ref.Mix(text,num));
		

}
}
