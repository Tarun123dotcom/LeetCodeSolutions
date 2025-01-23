// Used the bruteforce method to solve the problem 
// We have created a new array with the size that is equal to the sum of sizes of the both the arrays
// We copied the elements of the both arrays to new arry using the for loops and sorted the new array using Arrays.sort()
// We find the median of that array

import java.util.*; 
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ns = nums1.length+nums2.length;
        int[] na = new int[ns];
        int c=0;
        for(int j=0;j<nums1.length;j++){
            na[c]=nums1[j];
            c++;
        }
        for(int j=0;j<nums2.length;j++){
            na[c]=nums2[j];
            c++;
        }
        Arrays.sort(na);
        if(ns%2==0){
            double result = ((na[ns/2]+na[(ns/2)-1])/2.0);
            return result;
        }else{
            double result = na[ns/2];
            return result;
        }
        
    }
}