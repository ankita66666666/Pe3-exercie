package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckStudentGradeTest {

    CheckStudentGrade checkStudentGrade;

    @Before
    public void setUpOnce() {
        checkStudentGrade = new CheckStudentGrade();
    }

    @After
    public void tearDownOnce() {
    }
// check marks for grade
    @Test
    public void test() {
        String expected = "All marks are correct";
        int array[] = {62, 23, 34};
        String actual = checkStudentGrade.test(array,3);
        assertEquals("Following is of checkstudentgrade class", expected, actual);
    }

    @Test
    public void testFailure() {
        String expected = "Error";
        int array[] = {62, 23, 134};
        String actual = checkStudentGrade.test(array,3);

        assertEquals("Following is of checkstudentgrade class", expected, actual);
    }
}