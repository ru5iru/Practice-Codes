import java.util.ArrayList;

public class CODE006 {
   public static void main(String[] args){
      int[] nums1 = { 1, 2, 3, 3, 4, 2 };
      ArrayList<Integer> nums = new ArrayList<Integer>();

      for(int i = 0; i < nums1.length; i++){
         boolean isDuplicate = false;
         for(int j = 0; j < i; j++){
            if(nums1[i] == nums1[j]){
               isDuplicate = true;
               break;
            }
         }
         if(!isDuplicate){
            nums.add(nums1[i]);
         }
      }
      System.out.println(nums);
   }
}
