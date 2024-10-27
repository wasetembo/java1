import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two 3x3 arrays
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        // Prompt user to enter the first array
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = input.nextInt();
            }
        }

        // Prompt user to enter the second array
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = input.nextInt();
            }
        }

        // Check if the arrays are identical
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }

        input.close();
    }

    /** Return true if m1 and m2 are identical */
    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if the dimensions of the arrays are the same
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        // Compare each element in the arrays
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
