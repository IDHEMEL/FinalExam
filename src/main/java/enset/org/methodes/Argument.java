package enset.org.methodes;

public class Argument {
    private String name;
    private String type;

    public Argument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}
