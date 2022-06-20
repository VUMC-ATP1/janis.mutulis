package homework.classHomework;

public class Triangle {
    int side1;
    int side2;
    int side3;
    double resArea;

    public Triangle() {
        System.out.println("Mēs veidojam trījstūri");
    }

    public Triangle(int side1, int side2, int side3, double resArea) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        double area;
        area = (side1 + side2 + side3)/2.0d;
        this.resArea = Math.sqrt(area* (area - side1) * (area - side2) * (area - side3));
    }

    public boolean IsAllSidesEqual (){
        if (side1 == side2 && side1 == side3){return true;}
        else return false;
    }

    public boolean IsTwoSidesEqual (){
        if (side1 == side2){return true;}
        else if (side2 == side3){return true;}
        else if (side3 == side1){return true;}
        else return false;
    }
}
