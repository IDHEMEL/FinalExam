package enset.org.entities;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entity{
    private List<String> properties = new ArrayList<>();

    public Annotation(String name) {
        super(name);
    }

    }


