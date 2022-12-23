package enset.org.methodes;

import java.util.List;

public class Constructor extends Methode {

    private String visibility;

    public Constructor(String name, List<Argument> params) {
        super(name, params);
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
    }
