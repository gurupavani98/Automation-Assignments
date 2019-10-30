package org.automation.rythmos.masergy;

public class Cap_space {

	public static void main(String[] args) {
		
		String sb="HIthisIsPavani";
		 char ch[]= sb.toCharArray();
        for(int i=0; i<sb.length();i++) {
        	
        	if(ch[i]>=65&& ch[i]<=90) {
        		System.out.print(" ");
        			System.out.print(ch[i]);
        		
        		}
        	else {
    			System.out.print(ch[i]);
    		}
        }
        
        	
        	
	}

}
