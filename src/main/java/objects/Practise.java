package objects;

public class Practise {
    public static void main(String[] args) {


        // circe metode
        Circle circle1 = new Circle();
        System.out.println(circle1.area);
        circle1.getArea(12);
        System.out.println(circle1.area);

        //car
        Car bmw = new Car("BMW", (byte) 5,true,1975,30200);
        System.out.println(bmw.brand);

        // Cat
        Cat cat1 = new Cat();
        cat1.name = "muris";
        System.out.println(cat1.name);
        //PezDispenser
        PezDispenser pd = new PezDispenser("PEZ Dispenser");
        System.out.println(pd.name + " ir " + pd.currentCandyAmount + " končas");
        pd.getCandyCount1();
        System.out.println("palikušas končas: " + pd.currentCandyAmount);
        pd.getCandyCount2(8);
        System.out.println("palikušas končas: " + pd.currentCandyAmount);
        pd.getCandyCount3();
        System.out.println("palikušas končas: " + pd.currentCandyAmount);
        pd.loadByOne();
        System.out.println("palikušas končas: " + pd.currentCandyAmount);
    }
}
