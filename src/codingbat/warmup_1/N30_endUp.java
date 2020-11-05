package codingbat.warmup_1;

public class N30_endUp {

	public static String endUp(String str) {
		 int len = str.length();
		  
		  if (len > 2) {
			String f = str.substring(0, len-3); 
			String l = str.substring(len-3);
		    String l3 = l.toUpperCase();
		    return f + l3;
		  } else {			  
		  return str.toUpperCase();
		  }
		}
	
	public static void main(String[] args) {
		System.out.println(endUp("Hello"));	
		System.out.println(endUp("hi there"));	
		System.out.println(endUp("hi"));	
		System.out.println(endUp("woo hoo"));	
		System.out.println(endUp("xyz12"));	
		System.out.println(endUp("x"));	
		System.out.println(endUp(""));
	}
}
