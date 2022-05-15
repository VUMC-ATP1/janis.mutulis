package homework;

public class FirstClass {
    public static void main(String[] args) {
        /*
        Valsts:
        a.	Nosaukums
        b.	Iedzīvotājus skaits
        c.	Platība
        d.	Galvaspilsēta
        e.	Oficiāla valoda
        f.	Vai ir ES dalībvalsts
        g.	Valūta (viens simbols)

         */
        String name = "Luxembourg";
        int population = 645397;
        short area = 2586;
        String capital = "Luxembourg City";
        String language = "Luxembourgish";
        char currrency = '€';
        boolean isInEU = true;

        /*
        Luxembourg, officially the Grand Duchy of Luxembourg, is a landlocked country in Western Europe.
        Its capital, Luxembourg City, is one of the four official capitals of the European Union.
        Luxembourgish is the only national language of the Luxembourgish people, as defined by law.
        With an area of 2,586 square kilometers, it is one of the smallest sovereign states in Europe.
        In 2022, Luxembourg had a population of 645,397, which makes it one of the least-populous countries in Europe.

        Luxembourg is EU member country since 1 January 1958.
        Luxembourg is not EU member country.

        Currency: Euro (€) (EUR).
         */
        System.out.println(name + ", officially the Grand Duchy of Luxembourg, is a landlocked country in Western Europe.");
        System.out.printf("Its capital, %s, is one of the four official capitals of the European Union.\n", capital);
        System.out.println(language + " is the only national language of the Luxembourgish people, as defined by law.");
        System.out.printf("With an area of %s square kilometers, it is one of the smallest sovereign states in Europe.\n", area);
        System.out.printf("In 2022, Luxembourg had a population of %b, which makes it one of the least-populous countries in Europe.\n", population);
        System.out.printf("Currency: Euro (%s) (EUR).\n", currrency);
        if (isInEU){
            System.out.printf("Luxembourg is EU member country since 1 January 1958.\n", isInEU);
        }
        else {
            System.out.printf("Luxembourg is not EU member country.", isInEU);
        }
        int a = 2022 - 1;
        int b = 1958;
        int c = a - b;
        System.out.printf("Luxembourg became EU member country %s years ago.\n", c);

        int d = 128514;
        int e = population / d;
        System.out.printf("Luxembourg City has a population of 128,514 inhabitants, which is %s-th of all population.\n", e);

        int f = (d / 100) * 70;
        System.out.println("Foreigners represent 70% of the city's population, that is " + f + ".");

    }
}
