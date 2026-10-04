package Patterns;

import java.sql.SQLOutput;

public class Diamond {
    public static void main(String[] args){
        int n = 4;
        // part 1 = pyramid
        for(int row = 1 ; row<=n; row++){
            //space
            for (int col = 1 ; col<= n - row; col++){
                System.out.print(" ");
            }
            //for stars
            for(int col = 1; col<=2*row-1; col++){
                System.out.print("*");
            }
            //move to next line
            System.out.println();
        }
        //part 2
        for(int row = n ; row>=1; row--){
            if(row==n){
                continue;
            }
            //space
            for (int col = 1 ; col<= n - row; col++){
                System.out.print(" ");
            }
            //for stars
            for(int col = 1; col<=2*row-1; col++){
                System.out.print("*");
            }
            //move to next line
            System.out.println();
        }
    }
}
