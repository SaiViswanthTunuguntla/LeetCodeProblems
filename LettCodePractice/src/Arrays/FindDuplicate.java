package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i:nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i,1);
            }else return i;
        }
        return -1;
    }

    public static int findDuplicateApproach2(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            int index= Math.abs(nums[i])-1;
            if(nums[index]<0) return index+1;
            nums[index]=-nums[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={2,1,3,4,2};
        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicateApproach2(nums));

    }
}
