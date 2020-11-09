package codingbat.warmup_2;

public class N08_arrayCount9 {

	public static int arrayCount9(int[] nums) {
		int cnt = 0;
		for (int n: nums)
			if (n == 9) {
				cnt++;
			}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,9};
		System.out.println(arrayCount9(arr1));
		int[] arr2 = {1,9,9};
		System.out.println(arrayCount9(arr2));
		int[] arr3 = {1,9,9,3,9};
		System.out.println(arrayCount9(arr3));
		int[] arr4 = {1,2,3};
		System.out.println(arrayCount9(arr4));
		int[] arr5 = {};
		System.out.println(arrayCount9(arr5));
		int[] arr6 = {4,2,4,3,1};
		System.out.println(arrayCount9(arr6));
		int[] arr7 = {9,2,4,3,1};
		System.out.println(arrayCount9(arr7));
	}
}
