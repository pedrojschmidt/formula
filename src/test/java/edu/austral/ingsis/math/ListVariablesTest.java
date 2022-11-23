package edu.austral.ingsis.math;

import edu.austral.ingsis.math.Operations.*;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ListVariablesTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        Function func1 = new Number(1.0);
        Function func2 = new Number(6.0);
        Function func3 = new Add(func1, func2);
        final List<String> result = func3.listVariables(List.of());
        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        Function func1 = new Number(12.0);
        Function func2 = new Variable("div");
        Function func3 = new Div(func1, func2);
        final List<String> result = func3.listVariables(List.of());
        assertThat(result, containsInAnyOrder("div"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        Function func1 = new Number(9.0);
        Function func2 = new Variable("x");
        Function func3 = new Div(func1, func2);
        Function func4 = new Variable("y");
        Function func5 = new Mul(func3, func4);
        final List<String> result = func5.listVariables(List.of());
        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        Function func1 = new Number(27.0);
        Function func2 = new Variable("a");
        Function func3 = new Div(func1, func2);
        Function func4 = new Variable("b");
        Function func5 = new Pow(func3, func4);
        final List<String> result = func5.listVariables(List.of());
        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        Function func1 = new Variable("z");
        Function func2 = new Number(2.0);
        Function func3 = new Number(1.0);
        Function func4 = new Div(func3, func2);
        Function func5 = new Pow(func1, func4);
        final List<String> result = func5.listVariables(List.of());
        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        Function func1 = new Variable("value");
        Function func2 = new Number(8.0);
        Function func3 = new Abs(func1);
        Function func4 = new Sub(func3, func2);
        final List<String> result = func4.listVariables(List.of());
        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        Function func1 = new Variable("value");
        Function func2 = new Number(8.0);
        Function func3 = new Abs(func1);
        Function func4 = new Sub(func3, func2);
        final List<String> result = func4.listVariables(List.of());
        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        Function func1 = new Number(5.0);
        Function func2 = new Variable("i");
        Function func3 = new Sub(func1, func2);
        Function func4 = new Number(8.0);
        Function func5 = new Mul(func3, func4);
        final List<String> result = func5.listVariables(List.of());
        assertThat(result, containsInAnyOrder("i"));
    }
}
