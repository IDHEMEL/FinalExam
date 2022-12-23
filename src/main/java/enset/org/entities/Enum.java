package enset.org.entities;

import java.util.ArrayList;
import java.util.List;

public class Enum extends Entity{
    private List<String> values = new ArrayList<>();

    public Enum(String name) {
        super(name);
    }
}

