public class LongestCommonPrefix {

//    Runtime: 1 ms, faster than 56.24% of Java online submissions for Longest Common Prefix.
//    Memory Usage: 37.7 MB, less than 81.87% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1){
            return strs[0];
        }
        int min=Integer.MAX_VALUE;
        int i,j=0;
        StringBuilder sb= new StringBuilder("");
        boolean check=false;
        for(int m=0;m<strs.length;m++) {
            min = Math.min(strs[m].length(), min);
            if (strs[m].length() == 0) {
                return "";
            }
        }
        while (j<min & !check)
        {
            for(i=0;i<strs.length-1;i++)
            {
                if(!(strs[i].charAt(j)==strs[i+1].charAt(j)))
                {
                    check=true;
                    break;
                }
            }
            if(!check)  sb.append(strs[0].charAt(j));
            j++;
        }
        return sb.toString();
    }

    public static String longestCommonPrefixLeetCodeSoln1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
    public static void main( String[] args ){
    String[] strs={"flower","flow","flo","fl","fasdaf"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefixLeetCodeSoln1(strs));
    }
}
