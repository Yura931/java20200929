package codingbat.warmup_2;

public class N17_has271 {
	
	public static boolean has271(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int arr1 = nums[i];
			int arr2 = nums[i+1];
			int arr3 = nums[i+2];
			if (arr2 == (arr1 + 5)) {
				if((arr3 >= arr1 - 3) && (arr3 <= arr1 + 1)) {
				return true;
				} 
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 7, 1};
		System.out.println(has271(arr1));
		int[] arr2 = {2, 7, 5, 10, 4};
		System.out.println(has271(arr2));
	}
}
