package easy;

public class ContainsNearbyDuplicate {
    public static  boolean containsNearbyDuplicate(int[] nums, int k) {
        int j=0;
        int n=nums.length;
        if(n==0)return  false;
        for (int i = 0; i <n ; i++) {
           if( i+k<n)j=i+k;else break;
           while(j>i)
           {
               if(nums[i]==nums[j]) return true;
               else j--;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums,2));
    }
}
