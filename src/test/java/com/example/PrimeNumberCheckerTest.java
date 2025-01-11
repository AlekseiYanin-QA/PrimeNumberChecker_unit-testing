package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeNumberCheckerTest {

    @Test
    public void testPositivePrime() {
        // Тестируем положительное простое число
        assertTrue(PrimeNumberChecker.isPrime(5), "5 должно быть простым числом");
    }

    @Test
    public void testPositiveComposite() {
        // Тестируем положительное составное число
        assertFalse(PrimeNumberChecker.isPrime(4), "4 не является простым числом");
    }

    @Test
    public void testOne() {
        // Тестируем число 1
        assertFalse(PrimeNumberChecker.isPrime(1), "1 не является простым числом");
    }

    @Test
    public void testNegativeNumber() {
        // Тестируем отрицательное число
        assertFalse(PrimeNumberChecker.isPrime(-3), "-3 не является простым числом");
    }

    @Test
    public void testZero() {
        // Тестируем число 0
        assertFalse(PrimeNumberChecker.isPrime(0), "0 не является простым числом");
    }

    @Test
    public void testLargePrime() {
        // Тестируем большое простое число
        assertTrue(PrimeNumberChecker.isPrime(7919), "7919 должно быть простым числом");
    }

    @Test
    public void testLargeComposite() {
        // Тестируем большое составное число
        assertFalse(PrimeNumberChecker.isPrime(7918), "7918 не является простым числом");
    }

    // Дополнительные тест-кейсы
    @Test
    public void testPrimeEvenNumber() {
        // Тестируем четное число (кроме 2)
        assertFalse(PrimeNumberChecker.isPrime(10), "10 не является простым числом");
    }

    @Test
    public void testPrimeIsTwo() {
        // Тестируем число 2
        assertTrue(PrimeNumberChecker.isPrime(2), "2 должно быть простым числом");
    }

    @Test
    public void testEdgeCases() {
        // Тестируем граничные случаи
        assertTrue(PrimeNumberChecker.isPrime(Integer.MAX_VALUE), "Integer.MAX_VALUE должно быть простым числом");
        assertFalse(PrimeNumberChecker.isPrime(Integer.MIN_VALUE), "Integer.MIN_VALUE не является простым числом");
    }

}