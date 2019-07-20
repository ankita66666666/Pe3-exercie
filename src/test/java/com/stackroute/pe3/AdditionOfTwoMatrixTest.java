package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class AdditionOfTwoMatrixTest {

    AdditionOfTwoMatrix am;


    @Before
    public void setUpOnce()  {
        am = new AdditionOfTwoMatrix();
    }

    @After
    public void tearDownOnce()  {
    }

    @Test
    public void check() {
        int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
        int a1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int a2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = am.testSum(3,2,a1,a2);

        assertArrayEquals(expected, actual);
    }

}