package com.example.ma_calculatrice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorModelTest {
    @Test
    public void addition_isCorrect() {
        assertThrows(ArithmeticException.class, () -> {
            CalculatorModel.exec("2+"); // Appel de la fonction avec un diviseur égal à zéro
        });
    }
}