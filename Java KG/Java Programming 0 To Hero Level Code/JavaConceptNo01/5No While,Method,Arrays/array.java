import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        //1]

        

        int[] myint = {1,2,3,4,5,6,7,8,9,10};

      System.out.println(myint[2]);

      //2

      int [] myArr = new int[5];

      myArr[0]=186;
      myArr[1]=6;
      myArr[2]=867;
      myArr[3]=866;
      myArr[4]=8;
//3
 //int index = 4 ;
//printing array

    //   System.out.println(myArr[0]);
    //   System.out.println(myArr[1]);
    //   System.out.println(myArr[2]);
    //   System.out.println(myArr[3]);
    //   System.out.println(myArr[index]);

// loop printing Array

int index = 0;

while (index < myArr.length) {
    System.out.println(myArr[index]);
    index++;
}



// serching in array / array traversal
Scanner input = new Scanner(System.in);

int[] arr = { 3 , 6 , 5 , 8, 87 ,4 ,68 ,23 ,9 ,98 ,34};

System.out.println("Welcome to array serching \n");

System.out.println("Enter the number you want to serch : ");

int num = input.nextInt();
boolean inFound = inFound(arr, num);

if (inFound) {
    System.out.println("Found");
}else{
    System.out.println("No Found");
}



// 5 String Array


String[] strarr = new String[4];

strarr[0]= "My String";

System.out.println(strarr[0]);
    }
public static boolean inFound(int[] arr , int num){

int index = 0;
while (index < arr.length) {
    
    if (arr[index]== num) {
        return true ;
    }
    
    index++;
}
    return false;
}    
}