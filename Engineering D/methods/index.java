package methods;

public class index {
    
public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5};
    method1(arr);
String nma = method2("   John Doe   ");
System.out.println("The formatted name is: " + nma);

 
}

public static void method1(int[] arr){
    
    int sum = 0;
    for(int i: arr){
        sum += i;
    }
    System.out.println("The sum of the array is: " + sum);

}


private static String method2(String name){
    return name.trim().toUpperCase();
    





}
};
