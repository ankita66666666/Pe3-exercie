package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateCheckTest {
    DateCheck dc;

    @Before
    public void setUpOnce() {
        //System.out.println("Inside setup once");
        this.dc = new DateCheck();
    }

    @After
    public void tearDownOnce() {
        //System.out.println("Inside teardown once");
        dc = null;
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = dc.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        boolean expectedValue1 = true;
        boolean actualValue1 = dc.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }


}
