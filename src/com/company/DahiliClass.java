package com.company;




class DahiliMain{

    int x;
    int y;
    static int a=14,b=18;

    DahiliMain(int x, int y){
        this.x=x;
        this.y=y;

    }

    //friendly
     class InnnerClass1{

        InnnerClass1(){
            System.out.println("I am the beast from inner class 1\n");
        }

        public String sum(){
            return "The Sum is: "+(x+y);
        }

    }

  //public
     public class InnnerClass2{

        public String sum(){
            return "The Sum is: "+(x+y);
        }

    }

    //private - can only be accessed within the class where it is created
    private class InnnerClass3{

        public String sum(){
            return "The Sum is: "+(x+y);
        }

    }




    //static inner class cannot access not static properties of the outer class
    public static class InnnerClass4{

        public String sum(){
            return "The Sum is: "+(a+b);
        }

    }





}





public class DahiliClass {



    public static void main(String[]args){

        DahiliMain dahiliMain=new DahiliMain(10,5);

        DahiliMain.InnnerClass1 innnerClass1=dahiliMain.new InnnerClass1();

        System.out.println("Give me: "+innnerClass1.sum());

        System.out.println("\n");
        //class accessed directly becoz it is a static class
        DahiliMain.InnnerClass4 innnerClass4=new DahiliMain.InnnerClass4();
        System.out.println("Give me: "+innnerClass4.sum());

    }




}
