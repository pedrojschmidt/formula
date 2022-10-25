package edu.austral.ingsis.math;

import edu.austral.ingsis.math.Operations.Add;
import edu.austral.ingsis.math.Operations.Div;
import org.junit.Test;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ListVariablesTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        List<String> result;
        Double number1 = 6.0;
        FunctionImpl function1 = new FunctionImpl(number1, null, null);
        Double number2 = 1.0;
        FunctionImpl function2 = new FunctionImpl(number2, function1, new Add());
        result = function2.listVariables();
        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        List<String> result;
        Variable variable1 = new Variable("div", null);
        FunctionImpl function1 = new FunctionImpl(variable1, null, null);
        Double number2 = 12.0;
        FunctionImpl function2 = new FunctionImpl(number2, function1, new Div());
        result = function2.listVariables();
        assertThat(result, containsInAnyOrder("div"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        final List<String> result = Collections.emptyList();

        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        final List<String> result = Collections.emptyList();

        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        final List<String> result = Collections.emptyList();

        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        final List<String> result = Collections.emptyList();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        final List<String> result = Collections.emptyList();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        final List<String> result = Collections.emptyList();

        assertThat(result, containsInAnyOrder("i"));
    }
}
