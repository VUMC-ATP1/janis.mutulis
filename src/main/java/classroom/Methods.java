package classroom;

public class Methods {
    public static void main(String[] args) {
        printMyNameAndAge("Janis", 39);
        checkAge(17);
        calculator(9,"+",9);
    }

    public static void printMyNameAndAge(String name,int age){
        System.out.printf("Your name is %s. Your age is %d\n", name,age);
    }

    public static void checkAge(int age){
        if (age < 0){
            System.out.printf("Vai esi dzīvs?");
        } else if (age >= 14 && age <=16) {
            System.out.printf("Pagaidi, Hektoru varēsi nopirkt jau drīz");
        } else if (age == 17) {
            System.out.printf("Pieņemu, ka tev aug bārda");
        } else if (age >= 18) {
        System.out.printf("Skrien uz veikalu, alko pārdod līdz 22");
        }
    }

    public static int calculator(int firstNumber,String operator, int secondNumber){

        if(operator == "+"){
            int i = firstNumber + secondNumber;
            return i;
        } else if (operator == "-") {
            int i = firstNumber - secondNumber;
            return i;
        } else if (operator == "*") {
            int i = firstNumber * secondNumber;
            return i;
        }

        return firstNumber;
    }
}
