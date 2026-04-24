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
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    int[][] sortedMatrix = {
    {10, 20, 30, 40},
    {15, 25, 35, 45},
    {27, 29, 37, 48},
    {32, 33, 39, 50}
    };
        
        //bubbleSort(sort);  
        //selectionSort(sort); 
        //insertionSort(sort);
        //spiralMatrix(matrix);
        //diagonalSum(matrix);
        staircaseSearch(sortedMatrix,33);

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

    public static void selectionSort(int arr[])
    {  
        int n = Array.getLength(arr);
        for(int i = 0 ; i < n ;i++){
            for (int j = i ; j < n ;j++){
            int temp = 0;
            if (arr[j]<arr[i]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }

        }    
            
          }

         for(int i = 0 ; i < n ;i++){
            System.out.print(arr[i] + " " );
         }

    }


        public static void insertionSort(int arr[])
    {  

        int n = Array.getLength(arr);
        for(int i = 0 ; i < n ;i++){
            for (int j = i - 1 ; j >=0 ;j--){
            int temp = 0;
            if (arr[j+1]<arr[j]){
            temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
            }

          }    
            
          }

         for(int i = 0 ; i < n ;i++){
            System.out.print(arr[i] + " " );
        }

    }


    public static void spiralMatrix(int matrix[][])
    {  

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        
        // Top Boundry
       while(rowStart <= rowEnd && colStart <= colEnd){
        for(int i = colStart ; i <= colEnd ;i++){
                System.out.print(matrix[rowStart][i]);
        } 
        //Right Boundry
        for(int i = rowStart + 1 ; i <= rowEnd ;i++){
                System.out.print(matrix[i][colEnd]);
        }  
        // Bottom Boundry
           if(rowStart == rowEnd){
            break;
        }
        for(int i = colEnd - 1 ; i >= colStart ;i--){
                System.out.print(matrix[rowEnd][i]);

        }

        // Left Boundry
        for(int i = rowEnd - 1 ; i >= rowStart + 1 ;i--){
        if(colStart == colEnd){
            break;
        }
            System.out.print(matrix[i][rowStart]);
 
        } 

        rowStart ++;
        colStart ++;
        rowEnd --;
        colEnd --;
            
          }

          System.out.println();
        }

       public static void diagonalSum(int matrix[][])
         {
        int s = 0;
        int n = matrix.length-1;


        int psum = 0;
        int ssum = 0;
 
         for (int i = s ; i<=n ; i++){    
            psum = psum + matrix[i][i];
            // condition for not adding middle variable double times if want total sum
           // if (i != n-i){
                    ssum = ssum + matrix[i][n-i];    
            //    }
            }
        
        System.out.print("Primary Diagonal Sum" + ": "+ psum);
        System.out.println();
        System.out.print("Secondry Diagonal Sum" + ": "+ ssum);

        }


        public static boolean staircaseSearch(int matrix[][],int key){

        int n = matrix.length-1;
        int row = 0;
        int col = n;

    while (row <= n && col >= 0) {
    
    
     if (key == matrix[row][col]){
        System.out.print( "The Key is Found At: " + "(" + col + "," + row +")" );
        return true;
        }

        else if (key < matrix[row][col]){
            col--;
        }
        else {
            row++;
        }
        }
        System.out.print("Keys not found");
        return false;

        }    
}
