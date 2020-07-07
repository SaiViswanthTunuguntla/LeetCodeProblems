package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {

                    res[0]=i;res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
    public static int[] twoSumApproach2(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(target-nums[i]))
            {
                map.put(nums[i],i);
            }
            else
            {
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                break;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr={2,5,3,1};
        int[] ints = twoSumApproach2(arr,5);
        for (int i:ints
        ) {
            System.out.println(i);
        }
    }
}
