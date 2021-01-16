package com.company;



interface Working{

   public  void showWorking();

}


class Dotktor implements Working{

    @Override
    public void showWorking() {
        System.out.println("Doktor is working....\n");
    }
}
class Hemsire implements Working{

    @Override
    public void showWorking() {
        System.out.println("Nurse is Working...\n");
    }
}


class Pilot implements Working{

    @Override
    public void showWorking() {
        System.out.println("Pilot is Working.....\n");
    }
}


class Balikci implements Working{

    @Override
    public void showWorking() {
        System.out.println("Fisherman is Working....\n");
    }
}




public class CastingTwo {


    public static void main(String[] args) {
        // write your code here
        Working [] working_array=new Working[4];

        working_array[0]=new Balikci();
        working_array[1]=new Dotktor();
        working_array[2]=new Hemsire();
        working_array[3]=new Pilot();

        displayArrays(working_array);
    }

    private static void displayArrays(Working[] working_array) {

        for (int i=0;i<working_array.length;i++){

            working_array[i].showWorking();

        }
    }


}
