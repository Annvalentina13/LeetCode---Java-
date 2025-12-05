/*
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109

*/


import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {

        // Step 1: Convert all numbers to strings
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort using a simple custom rule
        // If b+a is bigger than a+b, then b should come first
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: If the largest value is "0", answer is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build and return the final result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}
