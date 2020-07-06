package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int pow=0; int res=0;
        int n= digits.length;
        int[] resArray=new int[n+1];

        for(int i=n-1;i>=0;i--)
        {
            res= (int) (res+ (Math.pow(10,pow)*digits[i]));
            pow++;
        }
        res=res+1;
        int i=0;
        while(res>0)
        {
            int rem=res%10;
            resArray[i++]=rem;
            res=res/10;
        }

        return resArray;
    }

    public static void main(String[] args) {
        int[] arr={2,2,3,1};
        int[] ints = plusOne(arr);
        for (int i:ints
             ) {
            System.out.println(i);
        }

    }
}
