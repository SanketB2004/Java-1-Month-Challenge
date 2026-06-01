package problemsinjava.arraylevleprob;

public class sumandAverageAraayq {
    public static void main(String[] args) {

        System.out.println("Sum and average progrsm");

        int[] numAraay = arrayUtility.inputArray();
        long sum = sum(numAraay);
        System.out.println(sum);

        int average = avg(numAraay);
        System.out.println(average);

    }

    public static long sum(int[] numAraay) {
        int digit = 0;
        for (int i = 0; i < numAraay.length; i++) {

            digit += numAraay[i];

        }

        return digit;
    }

    public static int avg(int[] numAraay) {

        long sum = sum(numAraay);

        return (int) (sum / numAraay.length);
    }
}
