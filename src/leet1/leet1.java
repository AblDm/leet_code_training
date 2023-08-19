package leet1;

import java.util.Arrays;

public class leet1 {

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //You can return the answer in any order.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    //Example 2:
    //
    //Input: nums = [3,2,4], target = 6
    //Output: [1,2]
    //Example 3:
    //
    //Input:
    //Output: [0,1]
    //
    //
    //Constraints:
    //
    //2 <= nums.length <= 104
    //-109 <= nums[i] <= 109
    //-109 <= target <= 109
    //Only one valid answer exists.
    public static void main(String[] args) {
        int[] nums = new int [4];
        nums[0]= 1;
        nums[1]= 3;
        nums[2]= 4;
        nums[3]= 5;

        int target = 5;

        long startTime = System.nanoTime();
        String a = Arrays.toString(twoSum(nums, target));
        long finishTime = System.nanoTime();
        System.out.println(a + " найдено за время: " + (finishTime - startTime) + " наносекунд");


    }


    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;

    }

}
