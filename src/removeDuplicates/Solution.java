package removeDuplicates;

public class Solution {
	
	public static void main(String[] args) {
		int[] s= {
				1,2,3,3,4,4
		};
		System.out.println(removeDuplicates(s));
	}
	
	public static int removeDuplicates(int[] nums) {
		
		int l=nums.length;
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					l--;
				}
			}
		}
		return l;
	}
}
