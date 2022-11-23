package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Variable implements Function{

    private String name;

    public Variable(String name){
        this.name = name;
    }

    @Override
    public double calculateValue(Map<String, Double> variables) {
        return variables.get(name);
    }

    @Override
    public String printFunc() {
        return name;
    }

    @Override
    public List<String> listVariables(List<String> variablesNames) {
        List<String> aux = new ArrayList<>();
        aux.add(name);
        return Stream.concat(variablesNames.stream(), aux.stream()).collect(Collectors.toList());
    }
}
