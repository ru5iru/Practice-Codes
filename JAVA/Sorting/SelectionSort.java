package Sorting;

public class SelectionSort {
   static void selectionSort(int arr[]){
      int n = arr.length;

      for(int i = 0; i < n - 1; i++){
         int min_index = i;
         for(int j = i + 1; j < n; j++){
            if (arr[j] < arr[min_index]){
               min_index = j;
            }
         }

         int temp = arr[min_index];
         arr[min_index] = arr[i];
         arr[i] = temp;
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
      selectionSort(arr);
      printArr(arr);
   }

}
