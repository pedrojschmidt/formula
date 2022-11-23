package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mul implements Function {

    private Function func1;
    private Function func2;

    public Mul(Function func1, Function func2) {
        this.func1 = func1;
        this.func2 = func2;
    }

    @Override
    public double calculateValue(Map<String, Double> variables) {
        return func1.calculateValue(variables) * func2.calculateValue(variables);
    }

    @Override
    public String printFunc() {
        return func1.printFunc() + " * " + func2.printFunc();
    }

    @Override
    public List<String> listVariables(List<String> variablesNames) {
        return Stream.concat(func1.listVariables(variablesNames).stream(), func2.listVariables(variablesNames).stream()).collect(Collectors.toList());
    }
}
