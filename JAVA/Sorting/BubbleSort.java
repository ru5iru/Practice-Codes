package Sorting;

/**
 * BubbleSort
 */
public class BubbleSort {

   static void bubbleSort(int arr[]){
      
      int n = arr.length;
      int temp;
      boolean swapped;

      for(int i = 0; i < n - 1; i++){
         swapped = false;
         for(int j = 0; j < n - 1 - i; j++){
            if (arr[j] > arr[j + 1]){
               temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
               swapped = true;
            }
         }

         if (!swapped) {
            break;
         }
      }
   }

   static void printArr(int arr[]){
      int n = arr.length;
      
      for(int i = 0; i < n; i++){
         System.out.print(arr[i] + " ");
      }
   }

   public static void main(String args[]){
      int arr[] = {34, 45, 22, 5, 12, 89, 1, 10};
      bubbleSort(arr);
      printArr(arr);
   }
}