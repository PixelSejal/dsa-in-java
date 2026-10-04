package Patterns;

public class SolidSquare {
    public static void main (String[] args){
        int n = 4;
        //rows
        for (int row = 1; row<=n; row++){
        //columns
            for(int col = 1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
