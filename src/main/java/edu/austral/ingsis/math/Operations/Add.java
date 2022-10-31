package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.FunctionImpl;
import edu.austral.ingsis.math.Operation;

public class Add extends Operation {

    private static final String name = " + ";

    public Add() {
        super(name);
    }


    @Override
    public double makeOperation(FunctionImpl function) {
        return function.getVarValue() + function.getInnerFunction().calculateValue();
    }
}
