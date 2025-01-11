package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeNumberCheckerTest {

    /*
    Аннотация @BeforeEach может использоваться для инициализации общих данных перед каждым тестовым методом,
    но в данном случае она не нужна, так как нет необходимости в повторяющейся подготовке данных, поскольку каждая
    проверка независима от других и не требует общей предварительной настройки.

     */

    @Test
    void shouldReturnTrueForPrimeNumber() {
        // Проверяем, что 5 является простым числом
        int primeNumber = 5;
        assertTrue(PrimeNumberChecker.isPrime(primeNumber), primeNumber + " должно быть простым числом");
    }

    @Test
    void shouldReturnFalseForNonPrimeNumber() {
        // Проверяем, что 6 не является простым числом (составное)
        int nonPrimeNumber = 6;
        assertFalse(PrimeNumberChecker.isPrime(nonPrimeNumber), nonPrimeNumber + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForOne() {
        // Проверяем, что 1 не является простым числом
        int one = 1;
        assertFalse(PrimeNumberChecker.isPrime(one), one + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForNegativeNumbers() {
        // Проверяем, что -7 не является простым числом
        int negativeNumber = -7;
        assertFalse(PrimeNumberChecker.isPrime(negativeNumber), negativeNumber + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForZero() {
        // Проверяем, что 0 не является простым числом
        int zero = 0;
        assertFalse(PrimeNumberChecker.isPrime(zero), zero + " не является простым числом");
    }

    @Test
    void shouldReturnTrueForLargePrimeNumber() {
        // Проверяем, что 7919 является простым числом
        int largePrimeNumber = 7919;
        assertTrue(PrimeNumberChecker.isPrime(largePrimeNumber), largePrimeNumber + " должно быть простым числом");
    }

    @Test
    void shouldReturnFalseForLargeNonPrimeNumber() {
        // Проверяем, что 7920 не является простым числом (составное)
        int largeNonPrimeNumber = 7920;
        assertFalse(PrimeNumberChecker.isPrime(largeNonPrimeNumber), largeNonPrimeNumber + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForEvenNumbersExceptTwo() {
        // Проверяем, что 12 не является простым числом (четное, кроме 2)
        int evenNumber = 12;
        assertFalse(PrimeNumberChecker.isPrime(evenNumber), evenNumber + " не является простым числом");
    }

    @Test
    void shouldReturnTrueForTwo() {
        // Проверяем, что 2 является простым числом
        int two = 2;
        assertTrue(PrimeNumberChecker.isPrime(two), two + " должно быть простым числом");
    }

    @Test
    void shouldHandleBoundaryValuesCorrectly() {
        // Проверяем, что Integer.MAX_VALUE - это простое число, а Integer.MIN_VALUE - не является простым числом
        assertTrue(PrimeNumberChecker.isPrime(Integer.MAX_VALUE), Integer.MAX_VALUE + " должно быть простым числом");
        assertFalse(PrimeNumberChecker.isPrime(Integer.MIN_VALUE), Integer.MIN_VALUE + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForNegativeEvenNumber() {
        // Проверяем, что -20 не является простым числом (отрицательное четное)
        int negativeEvenNumber = -20;
        assertFalse(PrimeNumberChecker.isPrime(negativeEvenNumber), negativeEvenNumber + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForNegativeOddNumber() {
        // Проверяем, что -17 не является простым числом (отрицательное нечетное)
        int negativeOddNumber = -17;
        assertFalse(PrimeNumberChecker.isPrime(negativeOddNumber), negativeOddNumber + " не является простым числом");
    }

    @Test
    void shouldReturnFalseForLargeNegativeNumber() {
        // Проверяем, что -1000000 не является простым числом (большое отрицательное)
        int largeNegativeNumber = -1000000;
        assertFalse(PrimeNumberChecker.isPrime(largeNegativeNumber), largeNegativeNumber + " не является простым числом");
    }
}