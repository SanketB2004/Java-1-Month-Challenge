package problemsinjava.arraylevleprob;

import java.util.Scanner;

public class searc2d {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Welcome To 2 D Search");
    
    
    int[][] numArr = arrayUtility.input2DArray();
    System.out.println("Now Enter The Number You Want Search");

    int num = input.nextInt();

    
    
    
    
    boolean isfound = searc2d(numArr, num);

    if (isfound) {
        System.out.println("Yes Found");
    }
else{
    System.out.println("Your Number Is not found");
}
    
    
    
    
    
    }
    public static boolean searc2d(int[][] numArr, int num){

int i = 0;

while (i<numArr.length) {
    int j = 0;
    while (j<numArr.length) {
        if (numArr[i][j]==num) {
            return true;
        }
        j++;
    }
    i++;
}
        return false;
    }


}
