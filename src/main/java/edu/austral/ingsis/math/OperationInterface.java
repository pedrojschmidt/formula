package edu.austral.ingsis.math;

public interface OperationInterface {

    public double makeOperation(Variable var1, Variable var2);
    public double makeOperation(Variable var1, Double num2);
    public double makeOperation(Double num1, Variable var2);
    public double makeOperation(Double num1, Double num2);
}
