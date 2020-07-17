package Strings;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
    public void reverseString(char[] s) {
        int n= s.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
    }

    //using recurssion
    public static void reverseStringRecurssion(char[] s) {
        helper(s,0,s.length-1);
    }

    private static void helper(char[] s, int left, int right) {
        if(left>=right) return;
        char temp=s[right];
        s[right--]=s[left];
        s[left++]=temp;
        helper(s,left,right);
    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseStringRecurssion(s);
        System.out.println(s);



    }
    public int firstUniqChar(String s) {
        Map<Character,Integer> map= new HashMap<>();
        char[] arr= s.toCharArray();
        for(char c: arr)
        {
            int frq= map.getOrDefault(c,0);
            map.put(c,frq+1);
        }
        for(int i=0; i<arr.length;i++)
        {
            if(map.get(arr[i])==1) return i;
        }
        return -1;
    }

}
