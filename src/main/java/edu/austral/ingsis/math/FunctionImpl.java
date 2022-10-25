package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionImpl implements Function{

    private Variable variable;
    private Double number;
    private Function innerFunction;
    private List<Variable> variables;
    private Operation operationWithInnerFunction;

    public FunctionImpl(Variable variable, Function innerFunction, Operation operationWithInnerFunction) {
        this.variable = variable;
        this.number = null;
        this.variables = getVariables(new ArrayList<>());
        System.out.println(variables.size());//
        this.innerFunction = innerFunction;
        this.operationWithInnerFunction = operationWithInnerFunction;
    }

    public FunctionImpl(Double number, Function innerFunction, Operation operationWithInnerFunction) {
        this.variable = null;
        this.number = number;
        this.variables = getVariables(new ArrayList<>());
        System.out.println(variables.size());//
        this.innerFunction = innerFunction;
        this.operationWithInnerFunction = operationWithInnerFunction;
    }

    @Override
    public void printFunc() {

    }

    @Override
    public void asignateVariablesValues() {
        Scanner scanner = new Scanner(System.in);
        for (Variable variable: variables) {
            System.out.println("Ingrese el valor de " + variable.getName() + ": ");
            double value = scanner.nextDouble();
            variable.setValue(value);
        }
    }

    @Override
    public List<String> listVariables() {
        List<String> aux = new ArrayList<>();
        for (Variable variable: variables) {
            aux.add(variable.getName());
        }
        return aux;
    }

    @Override
    public List<Variable> getVariables(List<Variable> aux) {
        if (variable != null) {
            aux.add(variable);
        }
        if (innerFunction == null) {
            return aux;
        } else{
            return getVariables(aux);
        }
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
