package problemsinjava.arraylevleprob;

import java.util.Scanner;

public class numberofocurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numArr = arrayUtility.inputArray();

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        int occ = numberofocurrences(numArr, num);

        System.out.println("Occurrences = " + occ);
    }

    public static int numberofocurrences(int[] numArray, int num) {

        int occ = 0;
        int i = 0;

        while (i < numArray.length) {

            if (numArray[i] == num) {
                occ++;
            }

            i++;
        }

        return occ;
    }
}