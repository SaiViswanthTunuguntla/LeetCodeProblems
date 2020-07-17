package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    //Not a recommended one
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1=m;
        int index2=0;

        while(index1<nums1.length)
        {
            nums1[index1++]=nums2[index2++];
        }
        Arrays.sort(nums1);
    }


    //Better TC and optimum soln
    public void mergeApparch2(int[] nums1, int m, int[] nums2, int n) {

        int tail1=m-1;
        int tail2=n-1;
        int pointer=n+m-1;

        while(tail1>=0 && tail2>=0)
        {
            nums1[pointer--]= (nums1[tail1]>nums2[tail2])?nums1[tail1--]:nums2[tail2--];
        }

        while(tail2>=0)
        {
            nums1[pointer--]=nums2[tail2--];
        }

    }


}
