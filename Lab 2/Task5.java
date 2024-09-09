import java.util.HashSet;
public class Task5 {
    public static int[] countCommonIndices(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        
        for(int num:nums1){
            set1.add(num);}

        for(int num:nums2){
            set2.add(num);}

        int answer1=0;
        for(int num:nums1) {
            if(set2.contains(num)){
                answer1++;
            }}

        int answer2=0;
        for(int num:nums2){
            if(set1.contains(num)){
                answer2++;
            }}
return new int[] {answer1,answer2}; }
 public static void main(String[] args) {
        int[] nums1_1 ={2,3,2};
        int[] nums2_1 ={1,2};
        System.out.println("Output: [" +countCommonIndices(nums1_1,nums2_1)[0] + "," + countCommonIndices(nums1_1, nums2_1)[1] + "]"); // Output: [2, 1]

        int[] nums1_2 ={4,3,2,3,1};
        int[] nums2_2 ={2,2,5,2,3,6};
        System.out.println("Output: ["+countCommonIndices(nums1_2,nums2_2)[0] + "," + countCommonIndices(nums1_2, nums2_2)[1] + "]"); // Output: [3, 4]

        int[] nums1_3 ={3,4,2,3};
        int[] nums2_3 ={1,5};
        System.out.println("Output: ["+countCommonIndices(nums1_3, nums2_3)[0] + "," + countCommonIndices(nums1_3, nums2_3)[1] + "]"); // Output: [0, 0]
    }  
}