package dropdowntask;

import java.util.Iterator;

public class reversestring {

	public static void main(String[] args) {
		
		//aproach 1
		/*String s="welcome";
		String rev="";
		 
		for (int i =s.length()-1; i >=0; i--) {
			
			rev = rev+s.charAt(i);
			
		}
		System.out.println("reverse string is :"+ rev);	
	*/
		// approach 2 by converting string to char array type
		String s = "welcome";
		String rev= "";
		
		char a[]= s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev= rev+a[i];
					
		}
		System.out.println("reverse string is :"+ rev);
	}
	
	
	
	
	
	
	
	
}
