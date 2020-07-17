package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SortColors {

    //with using extra space and in two pass-inplace
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.getOrDefault(0,0)>0)
            {
                nums[i]=0;
                map.put(0,map.get(0)-1);
            }else if(map.getOrDefault(1,0)>0)
            {
                nums[i]=1;
                map.put(1,map.get(1)-1);
            }else if(map.getOrDefault(2,0)>0)
            {
                nums[i]=2;
                map.put(2,map.get(2)-1);
            }
        }
    }
        //without using extra space and in one pass-inplace
    public void sortColorsApprach2(int[] nums) {
        if (nums.length==0 || nums.length==1) return;
        int start=0;
        int end=nums.length-1;
        int index=0;
        while(index<=end && start<end)
        {
            if(nums[index]==0)
            {
                nums[index]=nums[start];
                nums[start]=0;
                start++;
                index++;
            }else if(nums[index]==2)
            {
                nums[index]=nums[end];
                nums[end]=2;
                end--;
            }
            else{
                index++;
            }
        }
    }


}
