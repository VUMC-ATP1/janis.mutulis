package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {

        Scanner sacanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Ģenerātais cipars: " + randomNumber);
        System.out.println("Ievadiet ciparu");
        int mynumber = sacanner.nextInt();
        do {
            if (randomNumber != mynumber) {
                System.out.print("Neuzminēji!");
            }
        } while (randomNumber == mynumber);
        System.out.print("Uzminēji!");

    }
}
