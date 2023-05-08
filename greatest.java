

import java.util.Scanner;

public class greatest {
    public static void main(String args[]){

       Scanner S = new Scanner(System.in);

       System.out.println("Enter the value of a: ");
         int a = S.nextInt();
         System.out.println("Enter the value of b: ");  
            int b = S.nextInt();
            System.out.println("Enter the value of c: ");
            int c = S.nextInt();

        if(a > b && a > c){
            System.out.println("a is greatest");
        }
        else if(b > a && b > c){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }
        S.close();   
    }
    
}
