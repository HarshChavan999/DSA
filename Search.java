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
        int c = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = Array.getLength(arr);
        int j = n + 1;
        for (int i = 0 ; i < j ; i ++){
        for (int k = i + 1 ; k < j ; k ++){
             int sum = 0;
        for (int l = i ; l < k ; l ++){

           System.out.print(arr[l]);
            sum = sum + arr[l];
            
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

    public static void main(String[] args) {
      int arr[]={2,4,6,8,10};
       //linearSearch(arr, 8);
       //reverseArray(arr);
       //pairsInArray(arr);
       subArray(arr);
     }

    
}
