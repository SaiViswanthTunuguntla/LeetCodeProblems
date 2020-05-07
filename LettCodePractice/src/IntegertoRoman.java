public class IntegertoRoman {

    public static  String intToRoman(int num) {
        int nums[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(num>0 && i<nums.length){
            if(num-nums[i]>=0){
                sb.append(roman[i]);
                num=num-nums[i];
            }
            else{
                i++;
            }
        }
        return sb.toString();
       // return "";
    }

    public static void main( String[] args )
    {
       System.out.println( intToRoman(84));
       System.out.println(27%100);
    }
}
