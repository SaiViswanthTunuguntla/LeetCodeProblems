package Strings;

public class CountAndSay {

    //Iterative solution
    public static String countAndSay(int n) {
        if(n<=1) return "1";
        String res="1";
        while(n>1)
        {
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<res.length();i++)
            {
                int count=1;

                while(i+1<res.length() && res.charAt(i)==res.charAt(i+1))
                {
                    i++;
                    count++;
                }
                sb.append(count).append(res.charAt(i));
            }
            res=sb.toString();
            n--;
        }
        return res;
    }

    //better runtime than iterative soln
    public static String countAndSayRecursiveSoln(int n) {
        if(n<=1) return "1";

        String prev= countAndSayRecursiveSoln(n-1);

            StringBuilder sb= new StringBuilder();
            for(int i=0;i<prev.length();i++)
            {
                int count=1;

                while(i+1<prev.length() && prev.charAt(i)==prev.charAt(i+1))
                {
                    i++;
                    count++;
                }
                sb.append(count).append(prev.charAt(i));
            }
            prev=sb.toString();

        return prev;

    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
        System.out.println(countAndSayRecursiveSoln(5));
    }

}
