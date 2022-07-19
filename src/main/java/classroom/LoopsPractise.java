package classroom;

import java.util.Arrays;

public class LoopsPractise {
    public static void main(String[] args) {
        // print 0-4
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // print 10-0
        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        int[] arr = {2, 4, 6, 10, 15};
        int num = 0;
        while (num < arr.length) {
            System.out.println(arr[num]);
            num++;
        }

        //izdrukāt pāra skaitļis 0 līdz 10 izmantojot loop
        i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }

        // do while
        num = 0;
        do {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
            num++;
        } while (num < 10);

        i = 0;
        String[] countries = new String[]{"LV", "USA", "UK", "CZ", "PL","RO", "LV", "UK"};
        do {
            if (countries[i].equals("LV")) {
                System.out.print("Latvija, ");
            } else if (countries[i].equals("CZ")) {
                System.out.print("Czech, ");
            } else {
                System.out.print(countries[i] + ", ");
            }
            i++;
        } while (i < countries.length);
        System.out.println();

        for (int j = 0; j < countries.length; j++) {
            System.out.println(countries[j]);
        }
        //print 0-100
        for (int j = 0; j <= 100; j++) {
            System.out.print(j + ", ");
        }
        //izveido jaunu [] ar 0 - 100
        //izdrukāt tikai pāra skait

        int[] numbers = new int[100];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j;
        }
        System.out.println(Arrays.toString(numbers));

        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] % 2 == 0) {
                System.out.print(numbers[k] + ", ");
            }
        }

        for (String country : countries) {
            if(country.equals("LV")){
                System.out.println("Latvija");
            }
            System.out.println(country);
        }

        //print 0 - 100
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
        // mājas 1-50
        // negrib ka dalās ar 3 vai 5
        int[] houses = new int[50];
        for (int l = 0; l < houses.length; l++) {
            houses[l] = l;
        }
        for (int house : houses) {
            if(house % 3 == 0){
                System.out.print("");
            }
            else if(house % 5 == 0){
                System.out.print("");
            }
            else{System.out.print(house + ", ");}
        }

        int houseCount = 0;
        for (int k = 0; k <= 50; k++) {
            if (k % 3 == 0 || k % 5 ==0){
                System.out.println("Numuri neder:"+ k);
            }else {
                System.out.println("Numuri der: " + k);
                houseCount = houseCount + 1;
            }
            System.out.println();
        }

        String sentence = "Hello, my name is Nikita";
        int count = 0;
        for (int c = 0; c < sentence.length(); c++) {
            if (sentence.charAt(c) == 'i'){
                count = count + 1;
            }
            System.out.println("i skaits" + count);
        }
        for (String country:countries
             ) {
            System.out.println(country);

        }
    }
}


