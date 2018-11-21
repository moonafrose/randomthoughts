import java.util.*;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        //Since the question is asking about indices, we cannot sort it
        //So we need to use map.
        Map<Integer,Integer> map = new HashMap<>(); // {key=> number, value=> index}
        for(int i=0;i<nums.length;i++){
            int requiredNumber = target-nums[i];
            if(map.containsKey(requiredNumber)){
                return new int[]{map.get(requiredNumber),i};
            }
            else{
                map.put(nums[i],i);
            }
        }        
        return null;
    }
}