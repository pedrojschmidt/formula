package edu.austral.ingsis.math;

import java.util.List;

public interface Function {

    public void printFunc();
    public void asignateVariablesValues();
    public List<String> listVariables();
    public List<Variable> setVariables(List<Variable> aux);
}
