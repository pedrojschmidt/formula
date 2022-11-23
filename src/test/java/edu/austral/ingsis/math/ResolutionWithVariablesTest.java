package edu.austral.ingsis.math;

import edu.austral.ingsis.math.Operations.*;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ResolutionWithVariablesTest {

    /**
     * Case 1 + x where x = 3
     */
    @Test
    public void shouldResolveFunction1() {
        Function func1 = new Number(1.0);
        Function func2 = new Variable("x");
        Function add = new Add(func1, func2);
        final Double result = add.calculateValue(Map.of("x", 3.0));
        assertThat(result, equalTo(4d));
    }

    /**
     * Case 12 / div where div = 4
     */
    @Test
    public void shouldResolveFunction2() {
        Function func1 = new Number(12.0);
        Function func2 = new Variable("div");
        Function div = new Div(func1, func2);
        final Double result = div.calculateValue(Map.of("div", 4.0));
        assertThat(result, equalTo(3d));
    }

    /**
     * Case (9 / x) * y where x = 3 and y = 4
     */
    @Test
    public void shouldResolveFunction3() {
        Function func1 = new Number(9.0);
        Function func2 = new Variable("x");
        Function div = new Div(func1, func2);
        Function func3 = new Variable("y");
        Function mul = new Mul(div, func3);
        final Double result = mul.calculateValue(Map.of("x", 3.0, "y", 4.0));
        assertThat(result, equalTo(12d));
    }

    /**
     * Case (27 / a) ^ b where a = 9 and b = 3
     */
    @Test
    public void shouldResolveFunction4() {
        Function func1 = new Number(27.0);
        Function func2 = new Variable("a");
        Function div = new Div(func1, func2);
        Function func3 = new Variable("b");
        Function mul = new Pow(div, func3);
        final Double result = mul.calculateValue(Map.of("a", 9.0, "b", 3.0));
        assertThat(result, equalTo(27d));
    }

    /**
     * Case z ^ (1/2) where z = 36
     */
    @Test
    public void shouldResolveFunction5() {
        Function func1 = new Variable("z");
        Function func2 = new Div(new Number(1.0), new Number(2.0));
        Function pow = new Pow(func1, func2);
        final Double result = pow.calculateValue(Map.of("z", 36.0));
        assertThat(result, equalTo(6d));
    }

    /**
     * Case |value| - 8 where value = 8
     */
    @Test
    public void shouldResolveFunction6() {
        Function func1 = new Abs(new Variable("value"));
        Function func2 = new Number(8.0);
        Function sub = new Sub(func1, func2);
        final Double result = sub.calculateValue(Map.of("value", 8.0));
        assertThat(result, equalTo(0d));
    }

    /**
     * Case |value| - 8 where value = 8
     */
    @Test
    public void shouldResolveFunction7() {
        Function func1 = new Abs(new Variable("value"));
        Function func2 = new Number(8.0);
        Function sub = new Sub(func1, func2);
        final Double result = sub.calculateValue(Map.of("value", 8.0));
        assertThat(result, equalTo(0d));
    }

    /**
     * Case (5 - i) * 8 where i = 2
     */
    @Test
    public void shouldResolveFunction8() {
        Function func1 = new Number(5.0);
        Function func2 = new Variable("i");
        Function sub = new Sub(func1, func2);
        Function func3 = new Number(8.0);
        Function mul = new Mul(sub, func3);
        final Double result = mul.calculateValue(Map.of("i", 2.0));
        assertThat(result, equalTo(24d));
    }
}
