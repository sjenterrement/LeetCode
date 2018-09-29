package removeElement;

public class Solution {
	public static int removeElement(int[] nums, int val) {
//		int l = nums.length;
//		for (int i = 0; i < nums.length-1; i++) {
//			if (nums[i] == val) {
//				
//				for (int j = i; j < nums.length - 2; j++) {
//					nums[j] = nums[j + 1];
//					
//				}
//				l--;
//				i--;	
//			}
//		}
//		
//		if (nums[nums.length-1]==val) {
//			nums.toString().substring(0, nums.length-1);
//			l--;
//		}
//
//		return l;
		
		int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 2, 4, 6, 2 };
		int val = 2;
		System.out.println(removeElement(nums, val));

	}
}
