package Strings;

public class StringToInteger {

    public static int myAtoi(String str) {
        String trmStr = str.trim();
        boolean isNegative= false;
        if(trmStr.isEmpty()) return 0;
        if(trmStr.charAt(0)=='-') isNegative=true;
        StringBuilder sb= new StringBuilder();
        for (int i = isNegative?1:0; i <=trmStr.length()-1 ; i++) {
            char c= trmStr.charAt(i);
            if(!Character.isDigit(c)) break;
            else{
                sb.append(c);
            }
        }
            if(sb.length()==0) return 0;
            double res= isNegative?-Double.valueOf(sb.toString()):Double.valueOf(sb.toString());
        if(res>Integer.MAX_VALUE ) return Integer.MAX_VALUE;
        else if (res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)res;
    }

    //Better approch
    public static int myAtoiApproach2(String str) {
        String trmStr = str.trim();
        boolean isNegative= false;
        int index=0;
        double res=0;
        if(trmStr.isEmpty()) return 0;
        if(trmStr.charAt(0)=='-' || trmStr.charAt(0)=='+') index++;
        if(trmStr.charAt(0)=='-')   isNegative=true;

        for (int i = index; i <trmStr.length() ; i++) {
            char c= trmStr.charAt(i);
            if(c <'0'|| c > '9') break;
            else {
                int num= (int) c-'0';
                res= res*10 +num;
            }
        }
        if(isNegative)res*=-1;
        if(res>Integer.MAX_VALUE ) return Integer.MAX_VALUE;
        else if (res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)res;
    }
    public static void main(String[] args) {
            System.out.println(myAtoi("  +4193 with words"));
        System.out.println(myAtoiApproach2("  +41000000000000000000000093 with words"));
    }
}
