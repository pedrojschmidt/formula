package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.FunctionImpl;
import edu.austral.ingsis.math.Operation;

public class Mod extends Operation {

    private static final String name = " |%s| "; //String.format(name, value)

    public Mod() {
        super(name);
    }

    @Override
    public double makeOperation(FunctionImpl function) {
        return Math.abs(function.calculateValue());
    }
}
