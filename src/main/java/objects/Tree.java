package objects;

public class Tree {
    String species;
    String name;
    byte aproxHeightM;
    boolean hasLeefs;
    int aproxAge;

    public Tree(String species, String name, byte aproxHeightM, boolean hasLeefs, int aproxAge) {
        this.species = species;
        this.name = name;
        this.aproxHeightM = aproxHeightM;
        this.hasLeefs = hasLeefs;
        this.aproxAge = aproxAge;
    }

    public Tree() {
    }
}
