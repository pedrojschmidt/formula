package edu.austral.ingsis.math;

import edu.austral.ingsis.math.Operations.Mod;

import java.util.List;

public class Variable implements Function{

    private String name;
    private Double value;

    //Incluye numeros (se les pasa el name igual al value)
    public Variable(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public Variable(String name) {
        this.name = name;
        this.value = null;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public double calculateValue() {
        return value;
    }

    @Override
    public String printFunc() {
        return name;
    }

    @Override
    public void asignateVariablesValues() {

    }

    @Override
    public List<String> listVariables() {
        return null;
    }

    @Override
    public List<Variable> setVariables(List<Variable> aux) {
        return null;
    }
}
