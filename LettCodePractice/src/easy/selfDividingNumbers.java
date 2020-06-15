package easy;

import java.util.ArrayList;
import java.util.List;

public class selfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(selfDivider(i)) list.add(i);
        }
        return list;
    }

    public static boolean selfDivider(int x){
        int dup=x; int rem=1;
        // boolean res=true;
        // if(x%10==0) return false;
        while(x>0)
        {
            rem=x%10;
            if(rem==0||dup%rem!=0)//|| )
            {
                return false;
                //break;
            }
            x=x/10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(70,708));
    }
}
