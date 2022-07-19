package objects;

public class Company {
    String title;
    int regNr;
    boolean isGovernment;
    int regYear;
    double initValue;

    public Company(String title, int regNr, boolean isGovernment, int regYear, double initValue) {
        this.title = title;
        this.regNr = regNr;
        this.isGovernment = isGovernment;
        this.regYear = regYear;
        this.initValue = initValue;
    }

    public Company() {
    }
}

