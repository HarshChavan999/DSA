public class Recursion {
    public static void main(String[] args) {
       // System.out.println(tilingProblem(5));
          //  String str = "appnnacollege";
         //   removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
         //System.out.println(friendpairing(4));
            printBinaryStrings(3, 0, "");
    }

    public static int tilingProblem(int n) { // 2 * n floor
        if  (n==0 || n==1){
            return 1;
        }
        int verticalTiles = tilingProblem (n-1);

        int horizontalTiles = tilingProblem (n-2);
        return verticalTiles + horizontalTiles;
        
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']== true){ //
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            newStr.append(currChar);
            map[currChar - 'a'] = true; // mark the character as (True) visited in the map
            removeDuplicates(str, idx+1, newStr, map);
        }

    }

//Friends Pairing Problem
//Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in
//which friends can remain single or can be paired up.

    public static int friendpairing(int n){
        if (n==1 || n==2){
            return n;
        }
        return friendpairing(n-1) + (n-1)*friendpairing(n-2);

    }

    //Binary Strings Problem
    //Print all binary strings of size N without consecutive ones.

    public static void printBinaryStrings(int n, int lastPlace, String str){

        if (n==0){
            System.out.println(str);
            return;
        }
    
        printBinaryStrings(n-1, 0,str + "0");

        if (lastPlace == 0){
        printBinaryStrings(n-1,1, str + "1");
        }

    }


}

