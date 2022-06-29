package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
    //1. uzdevums
        int i = 0;
        while (i < 100) {
            Scanner input  = new Scanner(System.in);
            System.out.println("Ievadiet skaitli");
            int n = input.nextInt();
            i = i + n;
        }
        System.out.println("Gatavs!");
    //2. uzdevums
        Scanner input  = new Scanner(System.in);
        System.out.println("Ievadiet skaitli (pārbaudīsim vai ir pirmskaitlis)");
        int num = input.nextInt();
        boolean isPrime = true;
        for (int j = 2; j <= num / 2; ++j) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " ir pirmskaitlis");
        else
            System.out.println(num + " nav pirmskaitlis");
    //3.uzdevums
        int[] dayOfTheWeek = new int[]{1, 2, 3, 4, 5, 6, 7};
        String[] countries = new String[]{"LV", "USA", "UK", "CZ", "PL","RO", "LV", "UK"};
        char[] currency = new char[]{'$','€','£','¥'};
        int k = 0;
        System.out.print("int masīvs ar while: ");
        while (k < dayOfTheWeek.length) {
            System.out.print(dayOfTheWeek[k] + ", ");
            k++;
        }
        k = 0;
        System.out.println("");
        System.out.print("string masīvs ar do while: ");
        do{
            System.out.print(countries[k] + ", ");
            k++;
        }
        while (k < countries.length);
        System.out.println("");
        System.out.print("char masīvs ar for loop: ");
        for (int j = 0; j < currency.length; j++) {
             System.out.print(currency[j] + ", ");
        }
        System.out.println("");
        System.out.print("int masīvs ar foreach: ");
        for (int number : dayOfTheWeek) {
            System.out.print(number + ", ");
        }
        //4. uzdevums
        System.out.println("");
        int[] evenNumbers = new int[100];
        for (int j = 1; j < evenNumbers.length; j++) {
            evenNumbers[j] = j * 2;
        }
        System.out.print("pāra skaitļi: "+ Arrays.toString(evenNumbers));

        //5. uzdevums
      System.out.println("");
        System.out.println("Ievadiet skaitli, lai aprēķinātu tā faktoriālo vērtību");
        Scanner input2  = new Scanner(System.in);
        int num1 = input2.nextInt();
        int m = 1;
        int fact = 1;
       for(m = 1; m <= num1; m++){
            fact = fact * m;
        }
        System.out.println("Faktoriālais skailis no " + num1 + " ir " + fact);

        //6. uzdevums
        final int  VARIABLE_NAME = 6789;
        int tries;
        for (tries = 1; tries < 4; tries++) {
            System.out.println("Ievadiet PIN");
            Scanner input3  = new Scanner(System.in);
            int enteredPin = input3.nextInt();
            if (enteredPin == VARIABLE_NAME) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (tries == 3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
            } else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            }
        }
        }

    }


