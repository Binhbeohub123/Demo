package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaculator {

    private Caculator caculator;

    @BeforeMethod
    public void setUp() {
        // Khởi tạo Calculator trước mỗi test
        caculator = new Caculator();
    }

    @Test
    public void testSumPositive() {
        Assert.assertEquals(caculator.sum(2, 3), Integer.valueOf(5));
    }

    @Test
    public void testSumNegative() {
        Assert.assertEquals(caculator.sum(-2, -3), Integer.valueOf(-5));
    }

    @Test
    public void testSumZero() {
        Assert.assertEquals(caculator.sum(0, 0), Integer.valueOf(0));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(caculator.sub(2, 2), Integer.valueOf(0));
    }

    @Test
    public void testSubNegativeResult() {
        Assert.assertEquals(caculator.sub(2, 5), Integer.valueOf(-3));
    }
    @Test
    public void testSumFail() {
        // Test case này sẽ FAIL
        Assert.assertEquals(caculator.sum(2, 3), Integer.valueOf(10));
    }
    @Test
    public void testSumCorrect() {
        // Test case đúng
        Assert.assertEquals(calculator.sum(2, 3), Integer.valueOf(5));
    }
}