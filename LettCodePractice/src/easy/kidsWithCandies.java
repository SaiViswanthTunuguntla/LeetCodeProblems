package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithCandies {
//    Runtime: 2 ms, faster than 24.67% of Java online submissions for Kids With the Greatest Number of Candies.
//    Memory Usage: 40.3 MB, less than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int  maxKid=candies[0];
        List<Boolean> list=new ArrayList<>();
        for(int i:candies)
        {
            maxKid= Math.max(i,maxKid);
        }
        for(int i:candies)
        {
            if(i+extraCandies>=maxKid)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
