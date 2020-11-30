package codingbat.warmup_2;

public class N15_array667 {
	
	public static int array667(int[] nums) {
		int arr1[] = null;
		int arr2[] = null;
		int cnt = 0;
		
		for (int i = 0; i <nums.length - 1; i++) {
			int n1 = arr1[i];
			int n2 = arr2[i+1];
		
		if (n1 == 6 && n2 == 7 || n1 == 6 && n2 == 6) {
			cnt++;
		}
		}
		return cnt;
	}
	public static void main(String[] args) {
		
	}
}


