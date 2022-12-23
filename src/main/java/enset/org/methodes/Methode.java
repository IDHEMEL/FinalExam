package enset.org.methodes;

import java.util.ArrayList;
import java.util.List;

public abstract class Methode {private String name;
    private String type;
    private List<Argument> params = new ArrayList<>();

    public Methode(String name, List<Argument> params) {
        this.name = name;
    }

    public Methode(String name, String type, List<Argument> params) {
        this.name = name;
        this.type = type;
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Argument> getParams() {
        return params;
    }

    public void setParams(List<Argument> params) {
        this.params = params;
    }
}
