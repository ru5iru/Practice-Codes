public class CODE003 {
   public static int removeDuplicates(int[] nums) {
      int index = 1;
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] != nums[i-1]) {
            nums[index] = nums[i];
            index++;
         }
      }
      return index;
   }

   public static void main(String[] args) {
      int[] nums1 = { 1, 2, 2, 3, 3, 4 };
      int p = removeDuplicates(nums1);

      for (int i = 0; i < p; i++) {
         System.out.print(nums1[i] + " ");
      }
   }
}
