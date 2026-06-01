package problemsinjava.arraylevleprob;

public class sumandavg2d {
    
    public static void main(String[] args) {
        
        int[][] numArr = arrayUtility.input2DArray();
long sum = sum(numArr);

    System.out.println("Sum"+sum);



    }
    public static long sum(int[][] numArr){

long sum = 0;

int i = 0;

while (i<numArr.length) {
    
    int j = 0;
    while (j<numArr.length) {
        sum+= numArr[i][j];
        j++;
    }
    i++;
}


        return sum;


    }
}
