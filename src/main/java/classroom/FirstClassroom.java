package classroom;

import java.util.Arrays;

public class FirstClassroom {
    /*
    Access modifiers:
    public, private, protected, default
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("First arguments is " + args[0]);
        System.out.println("Second arguments is " + args[1]);



        //primitive data types: numbers
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n", floorCount);
        // %s = string
        // %d = number

        short junorTesterSlalry = 1000;
        short salariesInIt[] = {1000, 2000, 3000};
        short emptySalariesArray[] = new short[4];
        emptySalariesArray[0] = 1000;
        emptySalariesArray[1] = 2000;
        emptySalariesArray[2] = 3000;
        emptySalariesArray[3] = 4000;

        System.out.println(emptySalariesArray[2]);
        System.out.println(junorTesterSlalry);
        System.out.printf("Average salary for Junior QA Engenier is %d\n", junorTesterSlalry);

        int chinaPopulation = 1449687399;
        System.out.printf("China population is %d?\n", chinaPopulation);

        long currentWorldPopulation = 794609700;
        System.out.printf("Current World population: %d?\n", currentWorldPopulation);

        // floating numbers:
        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        /*
        Boolean:
        prefix: is, has
        example: isSummer, hasApples
         */
        boolean isSummer = false;
        if (isSummer){
            System.out.printf("Now it is summer! Because boolean value is: %b\n", isSummer);
        }
        else {
            System.out.printf("It is not summer yet! Because boolean value is: %b\n", isSummer);
        }

        //Primitive : Text
        char firstNameLetter = 'J';
        System.out.println(firstNameLetter);

        //Non-primitive: String
        String myNameAndSurname = "Janis Mutulis";
        System.out.println(myNameAndSurname);

        //Arithmetical operators
        System.out.println(7 + 7);
        System.out.println("7" + 7);
        System.out.println("7" + "7");

        int a = 10;
        int b = 5;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        boolean isAGraterThanB = a > b; //true
        System.out.println(isAGraterThanB);

    }
}
