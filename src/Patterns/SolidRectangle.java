package Patterns;

public class SolidRectangle {
    public static void main (String[] args){
        int i = 3;
        int j = 5;
        for(int row = 1 ; row<=i; row++){
            for(int col = 1; col<=j; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
