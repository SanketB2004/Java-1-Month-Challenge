public class d2array {
    public static void main(String[] args) {
        
//1 method
int [][] arr = {{1 ,2 ,3 }, {4, 5, 6}, {7 ,8 ,9}};

System.out.println(arr[2][2]);
//2 method

int[][] numarr = new int[3][2];

int i =0;
while (i < arr.length) {

int j = 0 ;
while (j<arr[i].length) {
    System.out.print(arr [ i ] [ j ]);
    j++;
}
System.out.println();
    i++;
    
}


    }
}
