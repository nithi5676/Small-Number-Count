package smallNumberCount;

import java.util.Scanner;
import java.util.Arrays;

public class SmallNumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements:");
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(count(array, size));
    }

    public static String count(int array[], int size) {
        int count[] = new int[size];
        Arrays.fill(count, 0);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    count[i]++;
                }
            }
        }
        return Arrays.toString(count);
    }
}
