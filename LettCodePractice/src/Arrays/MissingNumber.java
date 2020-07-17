package Arrays;

public class MissingNumber {
    //Using extra space
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int[] count =new int[len+1];
        for(int i:nums)
        {
            count[i]=1;
        }
        for(int i=0;i<len+1;i++)
        {
            if(count[i]!=1) return i;
        }
        return -1;
    }
    //without uisng extra space.
    // Calculated n(n+1)/2 and then found diff b/w expected sum and actual sum
    public int missingNumberApproach2(int[] nums) {
        int len= nums.length;
        int expectedSum= (len*(len+1))/2;
        int actualSum=0;
        for(int i:nums){
            actualSum+=i;
        }
        return expectedSum-actualSum;
    }
}

