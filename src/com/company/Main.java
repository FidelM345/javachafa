package com.company;




interface Calisan{

    public void getId();
    public void getName();


}


interface Calisan1{

    public void getNo();
    public void getCharacter();


}


interface  Doktor extends Calisan, Calisan1{

}

public class Main implements  Doktor{

    public static void main(String[] args) {
	// write your code here
        Main master=new Main();
        System.out.println("\n");
        master.getId();
        System.out.println("\n");
        master.getName();
        System.out.println("\n");
        master.getCharacter();

    }


    @Override
    public void getId() {
      System.out.println("My id is: 20481");
    }

    @Override
    public void getName() {
        System.out.println("My Name is: Fidel Morris Omolo");
    }

    @Override
    public void getNo() {
        System.out.println("My phone Number is: +905525245825");
    }

    @Override
    public void getCharacter() {
        System.out.println("My character  is: HardWorking Nerd");
    }
}
