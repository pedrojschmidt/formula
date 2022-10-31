package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.FunctionImpl;
import edu.austral.ingsis.math.Operation;
import edu.austral.ingsis.math.Variable;

//Cuando se le pasa como exponente 1/2 funciona como raiz cuadrada
public class Pow extends Operation {

    private static final String name = " ^ ";

    public Pow() {
        super(name);
    }

    @Override
    public double makeOperation(FunctionImpl function) {
        return 0;
    }
}
