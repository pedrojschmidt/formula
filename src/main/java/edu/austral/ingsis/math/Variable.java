package edu.austral.ingsis.math;

public class Variable {

    private String name;
    private Double value;

    public Variable(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }
}
