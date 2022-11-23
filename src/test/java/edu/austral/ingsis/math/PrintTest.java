package edu.austral.ingsis.math;

import edu.austral.ingsis.math.Operations.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrintTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldPrintFunction1() {
        Function func = new Add(new Number(1.0), new Number(6.0));
        final String expected = "1 + 6";
        String s = func.printFunc();
        final String result = s;
        assertThat(result, equalTo(expected));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldPrintFunction2() {
        Function func = new Div(new Number(12.0), new Number(2.0));
        String s = func.printFunc();
        final String expected = "12 / 2";
        final String result = s;
        assertThat(result, equalTo(expected));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldPrintFunction3() {
        Function func = new Parenthesis(new Div(new Number(9.0), new Number(2.0)));
        Function func2 = new Mul(func, new Number(3.0));
        final String expected = "(9 / 2) * 3";
        final String result = func2.printFunc();
        assertThat(result, equalTo(expected));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldPrintFunction4() {
        Function func = new Parenthesis(new Div(new Number(27.0), new Number(6.0)));
        Function func2 = new Pow(func, new Number(2.0));
        final String expected = "(27 / 6) ^ 2";
        final String result = func2.printFunc();
        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction6() {
        Function func = new Abs(new Variable("value"));
        Function func2 = new Sub(func, new Number(8.0));
        final String expected = "|value| - 8";
        final String result = func2.printFunc();
        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction7() {
        Function func = new Abs(new Variable("value"));
        Function func2 = new Sub(func, new Number(8.0));
        final String expected = "|value| - 8";
        final String result = func2.printFunc();
        assertThat(result, equalTo(expected));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldPrintFunction8() {
        Function func = new Parenthesis(new Sub(new Number(5.0), new Variable("i")));
        Function func2 = new Mul(func, new Number(8.0));
        final String expected = "(5 - i) * 8";
        final String result = func2.printFunc();
        assertThat(result, equalTo(expected));
    }
}
