public class SingleNumber {
    // Bruteforce method
    public int singleNumber(int[] nums) {
        int result =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            boolean isApp = false;
            for(int j=0;j<nums.length;j++){
                if(i !=j&&nums[i]==nums[j]){
                    isApp = true;
                }
            }
            if(!isApp){
                result = nums[i];
                break;
            }
        }
        return result;
    }

    // Optimised method
    public int singleNumberOp(int[] nums) {
                int result = 0;
                for (int num : nums) {
                    result ^= num;
                }
                return result;
    }
}
// We have two methods here one is brute force and another one is optimised one
// In brute force method we will compare each element with the whole array.
// In the optimised method we will XOR the result with the elements of the array
// The XOR of a number with itself is 0, and the XOR of a number with 0 is the number itself. 
// This property can be used to find the single number.
