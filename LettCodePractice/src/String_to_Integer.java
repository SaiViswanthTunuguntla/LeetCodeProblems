public class String_to_Integer {


//    Runtime: 2 ms, faster than 79.75% of Java online submissions for String to Integer (atoi).
//    Memory Usage: 39.6 MB, less than 5.59% of Java online submissions for String to Integer (atoi).
    public static int myAtoi(String str) {

        char[] charArry=str.trim().toCharArray();
        if(charArry.length==0)return 0;
        boolean isNegative=false;
        double find=0;
        int fin=0,i=0;

          if(charArry[0]=='-')
          {
              isNegative=true;
              i=1;
          }
          else if(charArry[0]=='+') {
              isNegative=false;
              i=1;
          }
          else if(!Character.isDigit(charArry[0])) return 0;

        for(;i<charArry.length;i++){
            if(Character.isDigit(charArry[i]))
                find=find*10+Integer.parseInt(String.valueOf(charArry[i]));
            else break;
        }

        if(isNegative) find=find*-1;
        if(find>=Integer.MAX_VALUE ) find=Integer.MAX_VALUE;
        else if (find<=Integer.MIN_VALUE) find = Integer.MIN_VALUE;

        return fin= (int) find;
    }
    // if(str==null || str.length()==0)return 0;
    //fin=fin*-1;//fin=fin*10+Integer.parseInt(String.valueOf(charArry[i]));
    public static void main( String[] args )
    {
       System.out.println(myAtoi("-91283472332"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

}
