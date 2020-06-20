package easy;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int pastSum=0;
        int newSum=0;
        int res=0;
        for(int i=0;i<3;i++)
        {
            pastSum=pastSum+nums[i];
        }
        res=pastSum;
        for(int i=3;i<nums.length;i++)
        {
            newSum=pastSum+nums[i]-nums[i-3];
            res=compare(res,newSum,target);
            pastSum=newSum;
        }
        return res;
    }

    public static int compare(int res, int newSum,int target)
    {
        int ans=0;
        ans=Math.min(Math.abs(res-target),Math.abs(newSum-target));
        if(ans==Math.abs((res-target)))return res;
        //else if(ans==Math.abs(newSum-target))
        return newSum;
    }
    public static int TwoPointerApproach(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int len= nums.length;
        int lo;
        int sum=0;
        int hi=0;
        Arrays.sort(nums);
        for (int i = 0; i < len&&diff!=0; ++i) {
            lo=i+1;hi=len-1;
            while (lo<hi)
            {
               sum=nums[i]+nums[lo]+nums[hi];
               if(Math.abs(target-sum)<Math.abs(diff))
               {
                   diff=target-sum;
               }

               if(sum<target)++lo;
               else  --hi;
            }

        }
        return target-diff;
    }

    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        System.out.println(TwoPointerApproach(nums,1));
    }
}
