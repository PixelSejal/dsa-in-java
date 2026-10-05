package Patterns;

public class Hourglass {
    public static void main(String[] args){
        int n = 4;
        for(int row = 1; row<=n; row++){
        //for space
            for(int col = 1; col<=row-1; col++){
                System.out.print(" ");
        }
            //for stars
            for(int col = 1; col<=2*n-2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1; row<=n; row++){
            //for space
            for(int col = 1; col<=n-row; col++){
                System.out.print(" ");
            }
            //for stars
            for(int col = 1; col<=2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    }



