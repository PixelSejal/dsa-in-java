package Patterns;

public class AlphabetTriangle {
    public static void main(String[] args){
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                int a = col;
                int b = ('A'-1);
                int result = a+b;
                char target = (char) result;
                System.out.print(target+" ");
            }
            System.out.println();
        }
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                int a = col;
                int b = ('G'-1);
                int result = b-a;
                char target = (char) result;
                System.out.print(target+" ");
            }
            System.out.println();
        }
    }
}
