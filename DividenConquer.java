public class DividenConquer {

        public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        int ans = search(arr, tar, 0, arr.length-1);
        System.out.println(ans);
    
    }


    public static int search(int arr[], int tar, int si, int ei){


        if (si > ei)             
            return -1;

  int mid = si + (ei - si)/2; 
        if (arr[mid] == tar){
            return mid;
        }
        // mid is on line one
       if (arr[si] <= arr[mid]){
            // case a: tar is left of line one
            if (tar >= arr[si] && tar <= arr[mid]){
                return search (arr, tar, si , mid -1);
            } else {

                // case b: tar is right of line one
                return search (arr, tar, mid + 1, ei);
                }
            }

    // mid is on line two
    else {
        // case a: tar is right of line two
        if (tar >= arr[mid] && tar <= arr[ei]){
            return search(arr,tar, mid +1, ei);
        }
        //case b: tar is left of line two
        else {
            return search (arr, tar, si, mid -1);
        }
    }
}
    
}
