package Strings;

public class ReverseInteger {

    //run time is very lowwwwww...naive approach
    public static int reverse(int x) {
        String s = String.valueOf(x);
        //System.out.println("before reveres: "+s);
        boolean isNegative=false;
        int index=0;
        if(s.charAt(0)=='-')
        {
            isNegative=true;
            index=1;
        }
        StringBuilder sb= new StringBuilder();
        for (int i = s.length()-1; i >=index; i--) {
            sb.append(s.charAt(i));
        }
        String s1 = sb.toString();
        //System.out.println("After reverse: "+s1);
        long l= Long.valueOf(s1);
        if(isNegative) l=-l;
        if(l>Integer.MAX_VALUE || l<Integer.MIN_VALUE) return 0;

        return (int)l;
    }
    //semi optimal
    public static int reverseApproach2(int x) {
        long res=0;boolean isNegative=false;
        if(x<0)
        {
            isNegative=true;
            x=-x;
        }
        while(x>0)
        {
            res= res*10+x%10;
            if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
            x/=10;
        }
        return (isNegative)?-(int)res:(int)res;
    }

    //Optimal approch 1
    public static int reverseApproach3(int x) {
        long res=0;
        while(x!=0)
        {
            res= res*10+x%10;
            //System.out.println(res);
            if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
            x/=10;
        }
        return (int)res;
    }


    public static void main(String[] args) {
            //System.out.println(reverse(-123));
        //System.out.println(reverseApproach2(-123));
        System.out.println(reverseApproach3(-123));
    }

}
