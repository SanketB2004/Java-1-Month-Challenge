package problemsinjava.arraylevleprob;

public class sorted {

    public static void main(String[] args) {

        System.out.println("Check Your Array Is Sorted Or Not");

        int[] numArr = arrayUtility.inputArray();

        if (arr(numArr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }

    public static boolean arr(int[] numArr) {

        int i = 1;

        while (i < numArr.length) {

            if (numArr[i] < numArr[i - 1]) {
                return false;
            }

            i++;
        }

        return true;
    }
    
}