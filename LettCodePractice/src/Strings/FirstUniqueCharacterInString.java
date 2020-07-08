package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        boolean isFound=false;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            isFound=false;
            for(int j=0;j<n;j++)
            {
                if(i==j)continue;
                if(s.charAt(i)==s.charAt(j))
                {
                    isFound=true;
                    break;
                }
            }
            if(!isFound) return i;
        }

        return -1;
    }
    //Apprach 2 using Hash map
    public int firstUniqCharApproch2(String s) {
        Map<Character,Integer> map =new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            int frq= map.getOrDefault(c,0);
            map.put(c,frq+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }

    //Apprach 2 using HashMap
    public int firstUniqCharApproach3(String s) {
        Map<Character,Integer> map =new HashMap<>();
        int n=s.length();
        for(char c:s.toCharArray())
        {
            int frq= map.getOrDefault(c,0);
            map.put(c,frq+1);

        }
        for(char c:s.toCharArray())
        {
            if(map.get(c)==1) return s.indexOf(c);
        }
        return -1;
    }

    //Uisng int array instead of Hash map--increased runtime 
    public int firstUniqCharApprach4(String s) {
        int[] count= new int[26];
        int n=s.length();

        for(char c: s.toCharArray())
        {
            ++count[c-'a'];
        }
        for(int i=0; i<n;i++)
        {
            if(count[s.charAt(i)-'a']==1) return i;
        }

        return -1;
    }


}
