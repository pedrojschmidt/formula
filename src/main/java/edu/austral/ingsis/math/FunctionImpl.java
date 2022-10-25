package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionImpl implements Function{

    private List<Variable> variables;

    @Override
    public void printFunc() {
        variables = new ArrayList<>();
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
}
