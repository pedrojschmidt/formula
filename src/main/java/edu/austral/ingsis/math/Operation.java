package edu.austral.ingsis.math;

public abstract class Operation implements OperationInterface {

    private String name;

    public Operation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
