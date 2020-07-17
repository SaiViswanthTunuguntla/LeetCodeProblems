package Strings;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int i=0;
        int j=s.length()-1;
        String s1=s.toLowerCase();
        while(i<j)
        {
            int start=s1.charAt(i);
            int end=s1.charAt(j);
            if(!((start>=97 && start<=122) || (start>=48 && start<=57)))
            {
                i++;
                continue;
            }
            if(!((end>=97 && end<=122) || (end>=48 && end<=57)))
            {
                j--;
                continue;
            }
            if(start!=end) return false;
            i++;
            j--;
        }
        return true;
    }

    //using character class methods--more concise and readble code
    public static boolean isPalindromeApproach2(String s) {
        if (s.isEmpty()) return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if (!Character.isLetterOrDigit(ci)) i++;
            else if (!Character.isLetterOrDigit(cj)) j--;
            else if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static int myAtoi(String str) {
        str= str.trim();
        char c= str.charAt(0);
        boolean isNegative=false;
        int index=0;

        if(c=='+'|| c=='-') index++;
        if(c=='-') isNegative=true;

        double res=0;

        for(int i=index;i<str.length();i++)
        {
            char cur= str.charAt(i);
            if(Character.isDigit(cur))
            {
                int num=(int)(cur-'0');
                res=res*10+ num;
            }else break;
        }
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (res<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return isNegative?-1*(int)res:(int)res;

    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("race a car"));
        //System.out.println(isPalindromeApproach2("race a car"));

        System.out.println(myAtoi("-789"));
    }
}
