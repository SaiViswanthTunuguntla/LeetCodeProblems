public class ContainerWithMostWater {

//    Runtime: 321 ms, faster than 20.01% of Java online submissions for Container With Most Water.
//    Memory Usage: 39.9 MB, less than 94.87% of Java online submissions for Container With Most Water.
    public static int maxArea(int[] height) {
         if(height.length<2) return 0;
        int MaxArea=0;
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                MaxArea=Math.max((j-i)*Math.min(height[i],height[j]),MaxArea);
            }
        }

    return MaxArea;
    }



    //Two Pointer Approach
    
    public static int maxAreaLeetcodeSolution(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static void main( String[] args )
    {
        int[] height={1,1};
        System.out.println(maxArea(height));
        System.out.println(maxAreaLeetcodeSolution(height));
    }
}
