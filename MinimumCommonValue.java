package practice;
//2540. Minimum Common Value
//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

public class MinimumCommonValue {
	public static int getCommon(int[] nums1, int[] nums2) {
		int minimum=Integer.MAX_VALUE;
		for(int i=0;i<nums1.length;i++){
			if(binarySearch(nums1[i], nums2)) {
				if(nums1[i]<minimum)
					minimum = nums1[i];
				return minimum;
			}
		}
		return -1;
    }
	public static Boolean binarySearch(int key,int[] nums2){
		int start = 0;
		int last = nums2.length-1;
		
		while(!(start>last)) {
			int mid = (start+last)/2;
			if(nums2[mid] == key) {
				return true;
			}
			
			if(key<nums2[mid]) {
				last = mid-1;
			}
			if(key>nums2[mid]) {
				start = mid+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int nums1[] = {1,3,6,8,9,9};
		int nums2[] = {9,33,45,56,68,69,70};
		System.out.println("Minimum element is :"+ getCommon(nums1, nums2));
	}

}
