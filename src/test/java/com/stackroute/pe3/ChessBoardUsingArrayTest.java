package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardUsingArrayTest {

    ChessBoardUsingArray cb;

    @Before
    public void setUpOnce()  {
        cb = new  ChessBoardUsingArray();
    }

    @After
    public void tearDownOnce()  {
    }

    @Test
    public void check() {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = cb.display(8,8);

        assertNotEquals("Following is chessPattern output",expected,actual);
    }

}


