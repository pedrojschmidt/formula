package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Parenthesis implements Function{

    private Function func1;

    public Parenthesis(Function func1) {
        this.func1 = func1;
    }

    @Override
    public String printFunc(){
        return "(" + func1.printFunc() + ")";
    }

    @Override
    public double calculateValue(Map<String, Double> variables) {
        return func1.calculateValue(variables);
    }

    @Override
    public List<String> listVariables(List<String> variablesNames) {
        return List.of();
    }
}
