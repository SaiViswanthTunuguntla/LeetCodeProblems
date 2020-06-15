package easy;

import java.util.Arrays;

public class thirdMax {

    //not a perfect soln
    public static  int thirdMax(int[] nums) {
        int length=nums.length;
        int ans;
        Arrays.sort(nums);
        //Arrays.stream(nums).forEach(i->System.out.println(i));
        System.out.println();
        if(length<3){
            //System.out.println(nums[length-1]);
            ans=nums[length-1];
        }else {
            ans=nums[length-3];
            //System.out.println(nums[length-3]);
        }
        return ans;
    }

    public static  int thirdMaxmethod2(int[] nums) {
        int max,seconndMax=0,thirdMax=0;
        int oldMax=0,oldSecMax=0;
        boolean maxChanged=false,secMaxChanged=false;
        int length=nums.length;
        max=Integer.MIN_VALUE;
        if(length>=3) {
            for (int i = 0; i < length; i++) {
                if(nums[i]==max||nums[i]==seconndMax||nums[i]==thirdMax) continue;
                if (nums[i] >= max) {
                    oldMax = max;
                    max = nums[i];
                    maxChanged = true;
                    //
                }
                if (maxChanged || nums[i] > seconndMax) {
                    oldSecMax = seconndMax;
                    seconndMax = maxChanged ? oldMax : nums[i];
                    secMaxChanged = true;
                    maxChanged = false;
                }
                if (secMaxChanged || nums[i] > thirdMax ) {
                    thirdMax = secMaxChanged ? oldSecMax : nums[i];
                    secMaxChanged = false;
                }
            }
        }else
        {
            for (int i = 0; i < length; i++) {
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        System.out.println("max "+max);
       System.out.println("secondMax "+seconndMax);
       System.out.println("thirdMax "+thirdMax);
        return thirdMax<0?max:thirdMax;
    }

    public static  int thirdMaxmethod3(int[] nums) {
        Integer max=null,seconndMax=null,thirdMax=null;
        for (Integer n:nums)
        {
            if(n==max||n==seconndMax||n==thirdMax) continue;
            if(max==null||n>max)
            {
                thirdMax=seconndMax;
                seconndMax=max;
                max=n;
            }else if(seconndMax==null||n>seconndMax)
            {
                thirdMax=seconndMax;
                seconndMax=n;
            }else if(thirdMax==null||n>thirdMax)
                thirdMax=n;

        }
        return thirdMax==null?max:thirdMax;
        }





    public static void main(String[] args) {
        //int[] arr={2,2,3,1};
        //int[] arr={1,5,7,2,9,6};
       // int[] arr={1,1,2};
        int[] arr={-2147483648,1,1};
        //int[] arr={3,2,1};
//       System.out.println( thirdMax(arr));
       System.out.println(thirdMaxmethod2(arr));
        System.out.println(thirdMaxmethod3(arr));

    }
}
