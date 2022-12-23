package enset.org.entities;

import enset.org.methodes.AbstractMethod;

import java.util.ArrayList;
import java.util.List;

public class Interface extends Entity{
    private List<AbstractMethod> methods = new ArrayList<>();

    public Interface(String name) {
        super(name);
    }
}
