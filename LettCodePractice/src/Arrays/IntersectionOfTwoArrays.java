package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//we place all array elements of nums1 (which is larger) in HashMap and its frequency.
// And when we Iterate through nums2 elements and checks if the element present in map ,
// if yes we put it in a list and decrease the freq of the element in map.
// By the end of nums2 we have list of elemnts whihc are intersection of both nus1 and nums2.
//TC: O(N+M);   SC: O(N);
//Refer: https://leetcode.com/problems/intersection-of-two-arrays-ii/discuss/282372/Java-solution-with-all-3-follow-up-questions


//see notebook/ leetcode for naive approach
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {

            if(nums1.length< nums2.length)
            {
                return intersect(nums2,nums1);
            }

            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i:nums1)
            {
                int frq=map.getOrDefault(i,0);
                map.put(i,frq+1);
            }
            List<Integer> list=new ArrayList<>();
            for(int i:nums2)
            {
                if(map.get(i)!=null && map.get(i)>0)
                {
                    list.add(i);
                    map.put(i,map.get(i)-1);
                }
            }
            int[] res= new int[list.size()];
            int index=0;
            for(int i:list) res[index++]=i;
            return res;

        }
    }


