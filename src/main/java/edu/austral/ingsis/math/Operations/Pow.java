package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Operation;
import edu.austral.ingsis.math.Variable;

public class Pow extends Operation {

    public Pow(String name) {
        super(name);
    }

    @Override
    public double makeOperation(Variable var1, Variable var2) {
        return 0;
    }

    @Override
    public double makeOperation(Variable base, Double exp) {
        return Math.pow(base.getValue(), exp);
    }

    @Override
    public double makeOperation(Double base, Variable exp) {
        return Math.pow(base, exp.getValue());
    }

    @Override
    public double makeOperation(Double num1, Double num2) {
        return 0;
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
