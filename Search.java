/**
 * DSA Practice: Search Algorithms and Array Operations
 * 
 * This file contains implementations of various search algorithms and array operations.
 * 
 * Current Implementations:
 * - Linear Search: O(n) search algorithm
 * - Array reversal: In-place array reversal
 * - Pair generation: Generate all pairs in an array
 * - Subarray operations: Find all subarrays and maximum subarray sum
 * - Prefix sum: Cumulative sum array
 * - Trapped Rainwater: Calculate trapped water in elevation map
 * 
 * @author Harsh Chavan
 * @version 1.0
 * @since 2024
 */

import java.lang.reflect.Array;

public class Search {

    public static void linearSearch(int n[], int key){

        for (int i = 0 ; i < Array.getLength(n); i ++){
            if (n[i]==key){
                System.out.println("Index :" + " " + i);
            }
        }
    }

    public static void reverseArray(int arr[]){

       int back = Array.getLength(arr);
        int j = back - 1;
        for (int i = 0 ; i < j ; i ++){
        
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr [j] = temp; 
            j--;

        }

        for (int i = 0 ; i < back ; i ++) {
            System.out.print(arr[i]+" ");
        }

        
    }

      public static void pairsInArray(int arr[]){

       int n = Array.getLength(arr);
        int j = n;
        for (int i = 0 ; i < j ; i ++){
        for (int k = i + 1 ; k < j ; k ++){
            System.out.print("("+ arr[i]+","+arr[k]+")");
        }
        }
    }
    public static void subArray(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int n = Array.getLength(arr);
        int j = n + 1;
        for (int i = 0 ; i < j ; i ++){
        for (int k = i + 1 ; k < j ; k ++){
        int sum = 0;
        for (int l = i ; l < k ; l ++){

           System.out.print(arr[l]);
            sum = sum + arr  [l];
            
            if (maxsum<sum){
                maxsum = sum;
            }
        //    arr2 [c] = sum;
        //    c++;
           
         }
          System.out.print(" " + "Sum Of Sub Array" + sum);
          System.out.println();     
        }
       
           }
        
      System.out.println(maxsum);

    }


        public static void prefixSum(int arr[]){
        int n = Array.getLength(arr);
        int j = n-1;
        for (int i = 0 ; i < j ; i ++){
            int k = i + 1;
            int sum = arr[i] + arr[k] ;
            arr[k] = sum;
         } 
        for (int k = 0; k<=j;k++ ){
        System.out.println(arr[k]);
        }
        }
    

    public static int trappedRainwater(int heights[]){


        int n = heights.length; 
        
        int leftMaxBoundry [] = new int[n];
        leftMaxBoundry[0] = heights[0];
        for (int i = 1; i<n; i++){
            leftMaxBoundry[i] = Math.max(heights[i],leftMaxBoundry[i-1]);
        }

        int rightMaxBoundry [] = new int[n];
        rightMaxBoundry[n-1] = heights[n-1];

        //Auxilary Array
        for (int i = n - 2; i >= 0; i--){
            rightMaxBoundry[i] = Math.max(heights[i],rightMaxBoundry[i+1]);
        }

        int trappedwater = 0;

        for (int i = 0; i<n ; i++) {
            int waterlevel = Math.min(leftMaxBoundry[i],rightMaxBoundry[i]);
            trappedwater += waterlevel - heights[i];
        }

        return trappedwater;

    }
        
      

    public static void main(String[] args) {
      int arr[]={2,4,6,8,10};
      int heights[] = {4,2,0,6,3,2,5};
       //linearSearch(arr, 8);
       //reverseArray(arr);
       //pairsInArray(arr);
       //subArray(arr);
       //prefixSum(arr);
        System.out.println(trappedRainwater(heights));
     }


    
}
