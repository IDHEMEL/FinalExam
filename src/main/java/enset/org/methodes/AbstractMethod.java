package enset.org.methodes;

import java.util.List;

public class AbstractMethod extends Methode{
    private String type;

    public AbstractMethod(String name, List<Argument> params) {
        super(name, params);
    }

    public void setType(String type) {
        this.type = type;
    }
}

