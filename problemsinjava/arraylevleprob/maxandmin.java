 package problemsinjava.arraylevleprob;

public class maxandmin {

    public static void main(String[] args) {

        System.out.println("Welcome to Max and Min Program");

        int[] numArr = arrayUtility.inputArray();

        int max = max(numArr);
        int min = min(numArr);

        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);
    }

    public static int min(int[] numArr) {

        int min = numArr[0];
        int i = 1;

        while (i < numArr.length) {

            if (numArr[i] < min) {
                min = numArr[i];
            }

            i++;
        }

        return min;
    }

    public static int max(int[] numArr) {

        int max = numArr[0];
        int i = 1;

        while (i < numArr.length) {

            if (numArr[i] > max) {
                max = numArr[i];
            }

            i++;
        }

        return max;
    }
}