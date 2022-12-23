package enset.org.methodes;

import java.util.List;

public class ConcreteMethod extends Methode{
    private String type;
    private String visibility;
    private boolean isFinal;
    private boolean isStatic;
    private boolean isAbstract;

    public ConcreteMethod(String name, String type, String visibility, List<Argument> params) {
        super(name, params);
    }
}
