package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //1.uzdevums
        int x = 6;
        //a.	vai x ir pozitīvs?
        System.out.println(x > 0);
        //b.	vai x ir negatīvs?
        System.out.println(x < 0);
        //c.	vai x ir lielāks par 5 un x ir mazāks vai vienāds ar 10?
        System.out.println(x > 5 && x <= 10);
        //d.	vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10?
        System.out.println(!(x <= 5) && x < 10);
        //e.	x ir vienāds 0 vai x ir vienāds 10?
        System.out.println((x == 0) || (x == 10));
        //f.	vai x * x reizinājums ir lielāks par 10?
        System.out.println((x * x) > 10);

        //2.uzdevums
        int month = 15;
        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:System.out.println("Gadā ir tikai 12 mēnešu");
        }
        //3. Uzdevums
        Scanner input  = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli");
        int n1 = input.nextInt();
        System.out.println("Ievadiet otro skaitli");
        int n2 = input.nextInt();
        System.out.println("Ievadiet trešo skaitli");
        int n3 = input.nextInt();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is lielākais");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " ir lielākais");
        else
            System.out.println(n3 + " ir lielākais");

        //4. uzdevums
        Scanner input2  = new Scanner(System.in);
        System.out.println("Ievadiet krāsu");
        String colour = input2.nextLine();
        if(colour.equals("sarkana"))
            System.out.println("Nedrīkst šķērsot ielu");
        else if (colour.equals("dzeltena"))
            System.out.println("Tūlīt ieslēgsies sarkanā gaisma");
        else if (colour.equals("zaļa"))
            System.out.println("Var šķērsot ielu");
        else
            System.out.println("Lauksofors visticamāk ir sabojājies");

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printBusinessCardTwo("Jānis", "Bērziņš","+371 12345678", 1973);
        printBusinessCardTwo("Līga", "Liepiņa","+371 87654321", 1983);
        printBusinessCardTwo("Pēteris", "Ozoliņš","+371 12341234", 1993);

        int summa = sum(4, 6);
        System.out.println(summa);

        System.out.println(average(10,2,4));
    }
    //5. uzdevums
    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +371 12345678");
        System.out.println("Dzimšanas gads: 1970");
        System.out.println("############");
    }

    //6. uzdevums
    public static void printBusinessCardTwo(String firstName, String lastName, String phone, int birthYear) {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: "+ firstName);
        System.out.println("Uzvārds: "+ lastName);
        System.out.println("Telefona numurs: "+ phone);
        System.out.println("Telefona numurs: "+ birthYear);
        System.out.println("############");
    }

    //7.uzdevums
    public static int sum(int a, int b){
        return a + b;
    }

    //8. uzdevums
    public static double average(double a, double b, double c){
        return (a + b + c)/3;
    }
}
