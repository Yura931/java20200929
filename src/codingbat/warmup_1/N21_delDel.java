package codingbat.warmup_1;

public class N21_delDel {

	public static String delDel(String str) {
		/*
		 * String del = "del";
		 * 
		 * if (str.indexOf(del, 1) == 1) { 
		 * return str.replaceFirst("del", ""); 
		 * } return str;         
		 */
		int len = str.length();

		  
		  if (len >= 4) {
		    String del = str.substring(1,4);
		    if(del.equals("del")){
		    String f = str.substring(0,1);
		    String b = str.substring(4);
		    return f + b;
		    }
		  } 
		  return str;
	}
	
	public static void main(String[] args) {
		System.out.println(delDel("adelbc"));	
		System.out.println(delDel("adelHello"));	
		System.out.println(delDel("adedbc"));	
		System.out.println(delDel("abcdel"));	
		System.out.println(delDel("add"));	
		System.out.println(delDel("ad"));	
		System.out.println(delDel("a"));	
		System.out.println(delDel(""));	
		System.out.println(delDel("del"));	
		System.out.println(delDel("adel"));	
		System.out.println(delDel("aadelbb"));
	}
}
