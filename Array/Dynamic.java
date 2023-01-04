package Array;

import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        int arr[] = new int[3];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter a number to add to an array ");
                arr[i] = scan.nextInt();

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
