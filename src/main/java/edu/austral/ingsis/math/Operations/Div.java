package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Operation;
import edu.austral.ingsis.math.Variable;

public class Div extends Operation {

    private static final String name = "/";

    public Div() {
        super(name);
    }

    @Override
    public double makeOperation(Variable num, Variable den) {
        return num.getValue() / den.getValue();
    }

    @Override
    public double makeOperation(Variable num, Double den) {
        return num.getValue() / den;
    }

    @Override
    public double makeOperation(Double num, Variable den) {
        return num / den.getValue();
    }

    @Override
    public double makeOperation(Double num, Double den) {
        return num / den;
    }

    @Override
    public double makeOperation(Variable var) {
        return 0;
    }

    @Override
    public double makeOperation(Double num) {
        return 0;
    }
}
