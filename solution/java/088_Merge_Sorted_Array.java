//Problem description:
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//Note:
//You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
//The number of elements initialized in nums1 and nums2 are m and n respectively.
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i, j, k;
        j = m - 1;
        k = n - 1;
        
        for(i = m + n - 1; i >= 0 && k >= 0 && j >= 0; i--) {
            if(nums1[j] > nums2[k]) {
                nums1[i] = nums1[j];
                j--;
            } else {
                nums1[i] = nums2[k];
                k--;
            }
        }
        
        if(k >= 0) {
            while(k >= 0) {
                nums1[i] = nums2[k];
                i--;
                k--;
            }
        }
    }
}