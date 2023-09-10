package leet1;

public class Leet7 {
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //
    //You must implement a solution with a linear runtime complexity and use only constant extra space.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [2,2,1]
    //Output: 1
    //Example 2:
    //
    //Input: nums = [4,1,2,1,2]
    //Output: 4
    //Example 3:
    //
    //Input: nums = [1]
    //Output: 1
    //
    //
    //Constraints:
    //
    //1 <= nums.length <= 3 * 104
    //-3 * 104 <= nums[i] <= 3 * 104
    //Each element in the array appears twice except for one element which appears only once.


    public static void main(String[] args) {
       int[] nums = {4,1,2,1,2};

        Long start = System.nanoTime();
        int r = singleNumber(nums);
        Long finish = System.nanoTime();

        System.out.println("результат " + r + " получен за " + (finish - start) + " наносекунд");


    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++)
        {
            result ^= nums[i];
        }
        return result;
    }


}
