package Patterns;

public class FloydsTriangle {
    public static void main(String[] args){
        int n = 5;
        int a = 1;
        for(int row = 1 ; row <=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }
}
