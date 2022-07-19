package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayPractise {
    public static void main(String[] args) {
        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(dayOfTheWeek.length);
        System.out.println(dayOfTheWeek[1]);

        String[] nameOfTheWeek = {"Pirmdiena", "Otrdiena", "Trešdiena"};
        System.out.println("Sodien ir: " + nameOfTheWeek[1]);

        String[] fruits = new String[6];
        fruits[0] = "ābols";
        fruits[1] = "kiwi";
        fruits[2] = "banāns";
        fruits[3] = "arbūzs";
        fruits[4] = "bumbieris";
        fruits[5] = "aprikoze";
        System.out.println(fruits[2]);
        fruits[2] = "vīnoga";
        System.out.println(fruits[2]);

        char[] myNamCharacters = {'J', 'ā', 'n' };
        System.out.println(myNamCharacters[0]);
    //Random
        Random random = new Random();
        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(randomNumbers));
    //Lists
        List<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("ābols");
        listOfFruits.add("kivi");
        listOfFruits.add("ķirši");
        System.out.println(listOfFruits.get(0));
        listOfFruits.remove(0);
        System.out.println(listOfFruits.get(0));
    //

    }
}
