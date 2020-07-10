package Strings;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();

        int i=0;int j=0;
        int res=0;
        if(n==0) return 0;
        if(n>m) return -1;

        for (i=0; i<m-n+1;i++)
        {
            for(j=0;j<n;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
            if(j==n)
            {
                return i;
            }
        }
        //if(i==m) res=-1;

        return -1;
    }
}
