package Array;

public class Static {
    public static void main(String[] args) {

        // Array of Integers
        int[] arr = { 1, 2, 3 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Array of Strings
        String[] arr1 = { "Tran", "Minh", "Hien" };
        int a = 0;

        while (a < arr1.length) {
            System.out.println(arr1[a]);
            a++;
        }
    }
}
