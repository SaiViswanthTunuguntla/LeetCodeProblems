package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] count= new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            count[c-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            char c=s.charAt(i);
            count[c-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>0||count[i]<0) return false;
        }
        return true;
    }

    //slight change to above approach--no change in TC
    public boolean isAnagramApproach2(String s, String t) {
        int[] count= new int[26];
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            count[c-'a']++;
            char ch=t.charAt(i);
            count[ch-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(count[i]!=0) return false;
        }
        return true;
    }

    //checking for negative value when iterating String t..and if found no more anagram.. return false;
    //less run time when compared to above approaches
    //TC: O(n)--n is length of strings
    public boolean isAnagramApproach3(String s, String t) {
        int[] count= new int[26];
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            count[c-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(--count[ch-'a']<0) return false;
        }
        return true;
    }

    //converting to arrays and sorting them and checking for equality..more concise code and readable code.
    //TC: O(nlogn)--sortingtakes nlogn time..and comparing takes O(n) time but sirting is dominant so..overall TC is O(nlogn)

    public boolean isAnagramApproach4(String s, String t) {
        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("a","b"));
    }
}
