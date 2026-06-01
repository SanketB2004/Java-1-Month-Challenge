package problemsinjava.arraylevleprob;

 class swaparray {
    
    public static void main(String[] args) {
       
       System.out.println("Reverce arry");
       
       int[] numArr = arrayUtility.inputArray();

       reverse(numArr);

arrayUtility.displayuArray(numArr);

    }
    public static void reverse(int[] arr){


        int i = 0 ;

        while (i < arr.length /  2) {
            
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            

            
            i++;
        }


    }
}
