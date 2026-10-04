package Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args){
        int n = 5;
        for(int row = 1; row <= n; row++){
            char ch = 'A';
            for(int col = 1; col<=n-row+1; col++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
