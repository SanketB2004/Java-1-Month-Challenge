package problemsinjava.arraylevleprob;

import java.util.Scanner;

public class deletingspecificelement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Array Deletion");

        int[] numArr = arrayUtility.inputArray();

        System.out.print("Now, enter the number you want to delete: ");
        int numToDelete = input.nextInt();

        int[] newArr = delete(numArr, numToDelete);

        System.out.println("Array after deletion:");
        arrayUtility.displayuArray(newArr);
    }

    public static int[] delete(int[] numArr, int numToDelete) {

        int occ = numberofocurrences.numberofocurrences(numArr, numToDelete);

        if (occ == 0) {
            System.out.println("Element not found.");
            return numArr;
        }

        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0;
        int j = 0;

        while (i < numArr.length) {

            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }

            i++;
        }

        return newArr;
    }
}