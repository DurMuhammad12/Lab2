import java.util.Arrays;
public class task1{
   public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i] ;}
        return ans;
  }
   public static void main(String[] args){
        int[] nums1 ={1, 2, 1};
        int[] result1 =getConcatenation(nums1);
        System.out.println("Output: " + Arrays.toString(result1));

        int[] nums2={1, 3, 2, 1};
        int[] result2 =getConcatenation(nums2);
        System.out.println("Output: " + Arrays.toString(result2));
    }}
 