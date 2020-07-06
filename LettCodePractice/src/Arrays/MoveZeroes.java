package Arrays;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        int index=0;

        for (int i = 0; i < n; i++) {
            if(nums[i]==0) continue;
            res[index++]=nums[i];
        }
        for (int i = index; i <n ; i++) {
            res[i]=0;
        }
        for (int i = 0; i < n; i++) {
            nums[i]=res[i];
        }

        return nums;
    }

    public static int[] moveZeroesInPlaceApproach(int[] nums) {
        int n= nums.length;
        int index=0;

        for (int i = 0; i < n; i++) {
            if(nums[i]!=0)
            nums[index++]=nums[i];
        }
        for (int i = index; i <n ; i++) {
            nums[i]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={0,3,0,1,8,0};
        int[] ints = moveZeroesInPlaceApproach(nums);
        for (int i:ints
             ) {
            System.out.println(i);
        }
    }
}
