package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public interface Function {

    public double calculateValue(Map<String, Double> variables);
    public String printFunc();
    public List<String> listVariables(List<String> variablesNames);
}
