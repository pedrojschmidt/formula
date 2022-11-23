package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Number implements Function{

    private Double number;

    public Number(Double number) {
        this.number = number;
    }

    @Override
    public double calculateValue(Map<String, Double> variables) {
        return number;
    }

    @Override
    public String printFunc() {
//        if (number == Math.floor(number)) {
//            return String.format("%d", number.intValue());
//        } else {
//            return String.format("%s", number);
//        }
        return String.format("%s", number);
    }

    @Override
    public List<String> listVariables(List<String> variablesNames) {
        return List.of();
    }
}
