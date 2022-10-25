package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Operation;
import edu.austral.ingsis.math.Variable;

public class Mul extends Operation {

    private static final String name = "*";

    public Mul() {
        super(name);
    }

    @Override
    public double makeOperation(Variable var1, Variable var2) {
        return var1.getValue() * var2.getValue();
    }

    @Override
    public double makeOperation(Variable var1, Double num2) {
        return var1.getValue() * num2;
    }

    @Override
    public double makeOperation(Double num1, Variable var2) {
        return num1 * var2.getValue();
    }

    @Override
    public double makeOperation(Double num1, Double num2) {
        return num1 * num2;
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
