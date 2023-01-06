package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(arr);
        System.out.println("Reverse the array");
        reverseArray(arr);
        printArray(arr);

    }

    static void reverseArray(int[] arr) {
        int temp;
        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i < (a - i)) {
                temp = arr[i];
                arr[i] = arr[a - i];
                arr[a - i] = temp;

            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
