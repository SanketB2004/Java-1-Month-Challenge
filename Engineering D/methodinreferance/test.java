public class test {

    public static void main(String[] args) {
    
    
    
    
    
    
    
    
    Cat a = new Cat();
    a.name = "Fluffy";
    Cat cat = makeCat(a);
    System.out.println(cat.name);
    
    
    
    
        //     System.out.println(sum(1,2));
    // }
    // public static int sum(int... a){

    //     int sum = 0 ;
    //     for(int i : a){
    //         sum+=i;

    //     }
    //     return sum;
    }

    public static Cat makeCat(Cat cat){

    cat.name=cat.name.toLowerCase();
return cat;
    }
}


}
