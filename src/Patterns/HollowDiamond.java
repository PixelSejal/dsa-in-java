package Patterns;

public class HollowDiamond {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int row = 1; row <= n; row++) {

            // spaces before stars
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // stars + hollow space
            if (row == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");

                for (int col = 1; col <= (2 * row) - 3; col++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {

            // spaces before stars
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // stars + hollow space
            if (row == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");

                for (int col = 1; col <= (2 * row) - 3; col++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}