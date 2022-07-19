package objects;

public class PezDispenser {
    int candyCout = 10;
    int currentCandyAmount;
    String name;

    public PezDispenser(String name) {
        this.name = name;
        currentCandyAmount = candyCout;
    }

    public int getCandyCount1() {
        currentCandyAmount = candyCout - 1;
        if(currentCandyAmount <=0 ){
            System.out.println("Nav tik daudz konču");
            currentCandyAmount = 0;
        }
        return currentCandyAmount;
    }
    public int getCandyCount2(int eatCandy) {
        currentCandyAmount = candyCout - eatCandy;
        if(currentCandyAmount <=0 ){
            System.out.println("Nav tik daudz konču");
            currentCandyAmount = 0;
        }
        return currentCandyAmount;
    }
    public int getCandyCount3() {
        currentCandyAmount = candyCout - candyCout;
        if(currentCandyAmount <=0 ){
            currentCandyAmount = 0;
        }
        return currentCandyAmount;
    }

    public void fillUp() {
        if(currentCandyAmount <0 ){
            currentCandyAmount = 10;
        }
        return;
    }

    public void loadByOne() {
        do {
            currentCandyAmount++;
        } while (currentCandyAmount < 10);
    }
}
