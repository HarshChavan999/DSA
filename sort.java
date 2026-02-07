/**
 * DSA Practice: Sorting Algorithms
 * 
 * This file contains implementations of various sorting algorithms.
 * 
 * Current Implementation:
 * - Bubble Sort: O(n²) comparison-based sorting algorithm
 * 
 * @author Harsh Chavan
 * @version 1.0
 * @since 2024
 */

import java.lang.reflect.Array;

public class sort {

    public static void main(String[] args) {
        int sort[] = {3,6,2,1,4,9,5};
        bubbleSort(sort);   
    }

    public static void bubbleSort (int arr[]){
        
        int n = Array.getLength(arr);
        for(int i = 2 ; i <= n ;i++){
            for (int j = 0 ; j <= n-i ;j++){
            int temp = 0;
            if (arr[j]>arr[j+1]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            }
            }    
            
        }

         for(int i = 0 ; i < n ;i++){
            System.out.print(arr[i] + " " );
         }
    }

    
}
