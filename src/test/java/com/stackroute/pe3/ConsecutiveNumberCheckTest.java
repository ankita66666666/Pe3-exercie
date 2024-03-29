package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberCheckTest {

    ConsecutiveNumberCheck consnum;

    @Before
    public void setUpOnce()  {
        consnum = new ConsecutiveNumberCheck();
    }

    @After
    public void tearDownOnce()  {
    }

    @Test
    public void checkNon() {
        boolean expected = false;

        boolean actual = consnum.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = consnum.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = consnum.checkConsecutive("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }

}
