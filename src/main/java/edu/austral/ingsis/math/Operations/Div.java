package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Operation;
import edu.austral.ingsis.math.Variable;

public class Div extends Operation {

    public Div(String name) {
        super(name);
    }

    @Override
    public double makeOperation(Variable var1, Variable var2) {
        return 0;
    }

    @Override
    public double makeOperation(Variable var1, Double num2) {
        return 0;
    }

    @Override
    public double makeOperation(Double num1, Variable var2) {
        return 0;
    }

    @Override
    public double makeOperation(Double num1, Double num2) {
        return 0;
    }
}
