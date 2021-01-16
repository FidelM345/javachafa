package com.company;




class EmployeeMaster{

    String name;
    String gender;

    public void workNow(){

        System.out.println("I am From the Employee Master");

    }

    public void workTomorrow(){

        System.out.println("Work Tomorrow I am From the Employee Master");

    }

}


class StaffChild extends EmployeeMaster{

    int age;

    public void workNow(){
        System.out.println("I am From the Staff Child class");
    }

}



public class UpDownCasting {


    public static void main(String[] args) {
        // write your code here

        EmployeeMaster employeeMaster=new StaffChild();

        employeeMaster.name="Fidel Omolo from parent";
        employeeMaster.gender="Male from parent";

        System.out.println("\n");
        employeeMaster.workNow();
        System.out.println("\n");
        employeeMaster.workTomorrow();
        System.out.println("\n");
        System.out.println(employeeMaster.name);
        System.out.println("\n");
        System.out.println(employeeMaster.gender);
        System.out.println("\n");


        //Down Casting----- acts like inheritance you will have access to both the parent and child attributes and properties
        // error is displayed we will check it later
      /*  StaffChild staffChild= (StaffChild) new EmployeeMaster();

        System.out.println("Showing the downcasting examples");
        System.out.println("\n");
        staffChild.workNow();
        System.out.println("\n");
        staffChild.workTomorrow();*/

    }


}
