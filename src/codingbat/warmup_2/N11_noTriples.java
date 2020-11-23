package codingbat.warmup_2;

public class N11_noTriples {
	
	public static boolean noTriples(int[] nums ) {
		int last = nums.length -2;
		
		for (int i = 0; i < last; i++) {
			if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,1,2,2,1};
		System.out.println(noTriples(arr1));	
		
	}
}

		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		       