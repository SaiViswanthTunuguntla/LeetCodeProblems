package easy;

public class RemoveDuplicatesArrays {

//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
//    Memory Usage: 41 MB, less than 91.75% of Java online submissions for Remove Duplicates from Sorted Array.
    public int removeDuplicates(int[] nums) {
        int breakPoint=0;
        int len=nums.length;
        for(int i=1;i<len;i++)
        {
            if(nums[i]==nums[breakPoint]) continue;
            else if(nums[i]>nums[breakPoint])
            {
                int temp=nums[i];
                nums[i]=nums[breakPoint+1];
                nums[breakPoint+1]= temp;
                breakPoint+=1;
            }
        }
        return breakPoint+1;
    }
}
