package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.FunctionImpl;
import edu.austral.ingsis.math.Operation;
import edu.austral.ingsis.math.Variable;

public class Div extends Operation {

    private static final String name = " / ";

    public Div() {
        super(name);
    }

    @Override
    public double makeOperation(FunctionImpl function) {
        return function.getVarValue() / function.getInnerFunction().calculateValue();
    }
}
