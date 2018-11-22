/*
    A peak element is an element that is greater than its neighbors.
    Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
    The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

    You may imagine that nums[-1] = nums[n] = -∞.

    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 is a peak element and your function should return the index number 2.

    Input: nums = [1,2,1,3,5,6,4]
    Output: 1 or 5 
    Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.
 */
public class PeakElement {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        //It is guaranteed that a solution will always exist. For a single element
        // eg. -∞ [2] -∞ will be true. 
        int left=0,right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid] < nums[mid+1]){ 
                //That means a solution is guaranteed for right side.
                //mid+1 is one potential solution, and more elements can be there on right
                left=mid+1;
            }
            else{
                right=mid; //That means a solution is guaranteed for left side.
                           //mid is one potential solution, and more elements can be there on left
            }
        }
        return left;
    }
    public int findPeakElementI(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        //Basically we are checking at each number and returning the first number that matches our criteria
        //It runs in 0(n)
        int i=0,j=1;
        while(j<nums.length && nums[i]<=nums[j]){
            i++;j++;
        }
        return i;
    }
}