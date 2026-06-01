package problemsinjava.arraylevleprob;

public class MergeSortedArray {

    public static void main(String[] args) {

        System.out.println("WELCOME TO MERGE SORTED ARRAY");

        int[] arr1 = arrayUtility.inputArray();
        int[] arr2 = arrayUtility.inputArray();

        int[] array = merge(arr1, arr2);

        System.out.println("Merged Array:");

        arrayUtility.displayuArray(array);
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }

        return newArr;
    }
}