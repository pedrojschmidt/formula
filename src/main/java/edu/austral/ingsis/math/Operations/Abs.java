package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;

import java.util.List;
import java.util.Map;

public class Abs implements Function {

    private Function func;

    public Abs(Function func) {
        this.func = func;
    }

    @Override
    public double calculateValue(Map<String, Double> variables) {
        return Math.abs(func.calculateValue(variables));
    }

    @Override
    public String printFunc() {
        return "|" + func.printFunc() + "|";
    }

    @Override
    public List<String> listVariables(List<String> variablesNames) {
        return func.listVariables(variablesNames);
    }
}
