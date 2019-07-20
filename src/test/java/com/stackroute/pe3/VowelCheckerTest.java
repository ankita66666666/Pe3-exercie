package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCheckerTest {

        VowelChecker vc;

        @Before
        public void setUpOnce() {
            vc = new VowelChecker();
        }

        @After
        public void tearDownOnce() {
        }

        @Test
        public void check() {
            String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
            String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
            String[] actual = vc.removeVow(str);

            assertArrayEquals(expected, actual);
        }

    }
