package easy;

import java.util.Arrays;
import java.util.Collections;

//Runtime: 3 ms, faster than 100.00% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
//        Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
public class canBeEqual {
    public static boolean canBeEqual(int[] target, int[] arr) {
        boolean canReverse=false;
        int count=0;
//        Arrays.sort(target);
//        Arrays.sort(arr);
        for(int i=0;i<target.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(target[i]==arr[j])
                {
                    canReverse=true;
                    //count++;
                    break;
                }
            }
            if(canReverse==true)
            {
                count++;
                canReverse=false;

            }
            else return false;
        }
        return count==target.length?true:false;
    }

//    Runtime: 2 ms, faster than 100.00% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
//    Memory Usage: 39 MB, less than 100.00% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
    public static boolean canBeEqualMethod2(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i <target.length ; i++) {
            if(target[i]!=arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] traget={3,7,11};
        int[] arr={3,7,11};

        System.out.println(canBeEqual(traget,arr));
        System.out.println(canBeEqualMethod2(traget,arr));
    }
}
