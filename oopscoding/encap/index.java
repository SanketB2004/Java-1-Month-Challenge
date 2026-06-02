package oopscoding.encap;


import oopscoding.more.myclaas2;


class Employ {
    
   static int empid = 2; // static is keyword memory mangement help use jo variable decler kiya hai kidha bhi access karu shakato
    private int empSal = 20000;// access modifier //
    private int incentive = 1000;
    private String name;
    private int  ph = 0;


    

    private void countSal(){ // static method pn karu shakato 
        System.out.println(empSal+incentive);
    }
    class index {
        public static void main(String[] args) {
        
            Employ engeneer = new Employ(); // Object this is object

             System.out.println(engeneer.empid); 

            System.out.println(Employ.empid);// acceess variable use to static



            //  referance  package

             myclaas2.print();
        }

    }
}
