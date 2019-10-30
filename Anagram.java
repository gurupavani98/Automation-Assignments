package org.automation.rythmos.masergy;

import java.util.Arrays;
import java.util.Scanner;
class check{
	  boolean is_anagram(String one, String two) {
		  if(one.length()==two.length()) {
			  char x[]=one.toLowerCase().toCharArray();
			  char y[]=two.toLowerCase().toCharArray();
			  Arrays.sort(x);
			  Arrays.sort(y);
			  return(Arrays.equals(x,y));
		  }
		return false;
		
		
		
	}
}

public class Anagram {

	public static void main(String[] args) {
		check ch = new check();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		System.out.println("Enter other string to be compared");
		String b=sc.nextLine();
		System.out.println(ch.is_anagram(a,b));

	}

	
}
