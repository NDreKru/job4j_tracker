package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FuncCalcTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FuncCalc fc = new FuncCalc();
        List<Double> result = fc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FuncCalc fc = new FuncCalc();
        List<Double> result = fc.diapason(1, 6, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D, 25D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        FuncCalc fc = new FuncCalc();
        List<Double> result = fc.diapason(1, 6, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D, 16D, 32D);
        assertThat(result, is(expected));
    }
}