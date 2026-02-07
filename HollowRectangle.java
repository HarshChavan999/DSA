/**
 * DSA Practice: Pattern Printing
 * 
 * This file contains implementations of pattern printing algorithms.
 * 
 * Current Implementation:
 * - Hollow Rectangle: Print a hollow rectangle pattern using stars
 * 
 * @author Harsh Chavan
 * @version 1.0
 * @since 2024
 */

class HollowRectangle {
    public static void main(String[] args) {

        invertedPiramid.piramid(5);
        
        int toRow = 5;
        int toCol = 5;
        for (int i = 1; i<=toRow ; i++){
            for (int j = 1; j<=toCol ; j++){
             if (i == 1 || i == toRow || j == 1 || j == toCol){
               System.out.print("*");
            }    
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
        }


    }
}