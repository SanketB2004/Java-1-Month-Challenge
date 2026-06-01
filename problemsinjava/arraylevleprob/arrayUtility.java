package problemsinjava.arraylevleprob;

import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray() {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your array Size :");
int size = input.nextInt();
        int [] arr = new int[size];


int i = 0;

        while (i < size) {
            System.out.println("Inter Your Number "+ (i+1));
        
        arr[i]=input.nextInt();

        i++;
        
        }
        return arr;   
    }
    

        public static void displayuArray(int[] numArr){

        int i= 0;

        while (i < numArr.length) {
            
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }

        
public static int[][] input2DArray() {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your row  :");
int rows = input.nextInt();
System.out.println("Enter Your column  :");
        
int column = input.nextInt();

int[][] numArray = new int[rows][column];

int i = 0;

        while (i < rows) {

            int j = 0;
            while (j<column) {
                
System.out.println("please enter element rows :"+ (i+1) + ",column : "+(j+1) +" :");
        
        numArray[i][j]=input.nextInt();

                j++;
            }

            

        i++;
        
        }
        return numArray;   
    }
    
    }

    

