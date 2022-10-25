package edu.austral.ingsis.math;

import java.util.*;

public class FunctionImpl implements Function{

    private Variable variable;
    private Double number;
    private FunctionImpl innerFunction;
    private List<Variable> variables;
    private Operation operationWithInnerFunction;

    public FunctionImpl(Variable variable, FunctionImpl innerFunction, Operation operationWithInnerFunction) {
        this.variable = variable;
        this.number = null;
        this.innerFunction = innerFunction;
        this.operationWithInnerFunction = operationWithInnerFunction;
        this.variables = setVariables(new ArrayList<>());
    }

    public FunctionImpl(Double number, FunctionImpl innerFunction, Operation operationWithInnerFunction) {
        this.variable = null;
        this.number = number;
        this.innerFunction = innerFunction;
        this.operationWithInnerFunction = operationWithInnerFunction;
        this.variables = setVariables(new ArrayList<>());
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
    public List<Variable> setVariables(List<Variable> aux) {
        if (innerFunction == null) {
            if (variable != null) {
                aux.add(variable);
            }
            return aux;
        } else{
            List<Variable> newList = new ArrayList<>();
            newList.addAll(innerFunction.getVariables());
            if (variable != null) {
                newList.add(variable);
            }
            return newList;
        }
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
