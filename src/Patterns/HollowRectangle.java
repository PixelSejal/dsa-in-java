package Patterns;

public class HollowRectangle {
    public static void main (String[] args){
        int i = 4;
        int j = 6;
        for(int row = 1; row<=i; row++){
            for(int col = 1; col<=j; col++){
                //boundary rows
                if(row == 1 || row ==i){
                    System.out.print("*");
                }
                //remaing rows
                else {
                    if(col == 1 || col ==j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
