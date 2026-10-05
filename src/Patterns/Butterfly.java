package Patterns;

public class Butterfly {
    public static void main(String[] args) {

        int n = 4;

        // Upper half
        for(int row = 1; row <= n; row++) {

            // Left stars
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Spaces
            for(int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            // Right stars
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for(int row = n; row >= 1; row--) {

            // Left stars
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Spaces
            for(int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            // Right stars
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}