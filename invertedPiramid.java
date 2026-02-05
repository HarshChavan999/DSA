public class invertedPiramid {   
    public static void piramid (int n){
    for (int i = 1 ; i <= n ; i++){

        for (int j = 1 ; j <= (n-i) ; j ++) 
        {
            System.out.print(" ");
        }

        for (int j = 1 ;  j<=i ; j++)
        {

            System.out.print("*");  

        }
        System.out.println();
}
}

public static void piramidWithNos(int n){
    for(int i = 1; i<=n;i++){
        for (int j = 1; j<=((n+1)-i); j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void main(String[] args) {
   // piramid(5);
   //piramidWithNos(5);
   //floydTriangle(5);
    //zoTriangle(5);
    butterfly(8);
}


public static void floydTriangle(int n){
    int k = 1;
        for(int i = 1; i<=n;i++){
        for (int j = 1; j<= i; j++){
        System.out.print(k);
        k++;
    
        }
        System.out.println();
    }
}


public static void zoTriangle(int n){

    for(int i = 1; i<=n;i++){
        for (int j = 1; j<= i; j++){
          if ((i+j)%2 == 0){
        System.out.print("1");
       }
       else{
        System.out.print("0");
       }
        }
        System.out.println();
    }
}

public static void butterfly(int n){
    int s = 2; 
        for(int i = 1; i<=n;i++){
        
        for (int j = 1; j<=s/2; j++){  
        System.out.print("*");
       }
        for (int j = 1; j<=(n-s); j++){  
        System.out.print(" ");
       }

        for (int j = 1; j<=s/2; j++){  
        System.out.print("*");
       }
       if (i<n/2){
        s = s+2;
       }
       else {
        s = s-2;
       }

        System.out.println();

    }
        

    }

 }







