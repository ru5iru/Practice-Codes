public class CODE002 {
   public static int removeElement(int[] nums, int val) {
      int index = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != val) {
            nums[index] = nums[i];
            index++;
         }
      }
      return index;
   }

   public static void main(String[] args) {
      int[] nums1 = { 1, 2, 3, 3, 4, 2 };
      int m = 3;
      int p = removeElement(nums1, m);

      for (int i = 0; i < p; i++) {
         System.out.print(nums1[i] + " ");
      }
   }
}
