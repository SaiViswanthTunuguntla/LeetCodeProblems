package Arrays;

public class MaxContiguousSubarraySum {

    //Dynamic programming --see doc for ref video
    //https://leetcode.com/problems/maximum-subarray/
    //Kadane's algo
    
    public int maxSubArray(int[] nums) {
        int max_so_far=nums[0];
        int max_ending_here=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            max_ending_here=Math.max(nums[i],max_ending_here+nums[i]);
            max_so_far=Math.max(max_ending_here,max_so_far);
        }
        return max_so_far;
    }


}
