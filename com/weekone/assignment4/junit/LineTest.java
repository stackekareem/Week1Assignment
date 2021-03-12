package com.weekone.assignment4.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void getSlope() {
            Line line  = new Line(0,0,1,1);
            assertEquals(1,line.getSlope());
            Line line2  = new Line(0,0,0,0);
            assertThrows(java.lang.ArithmeticException.class,() -> line2.getSlope());
 }

    @Test
    void getDistance() {
        Line line  = new Line(0,0,1,1);
        assertEquals(1.4142135623730951,line.getDistance());
    }

    @Test
    void parallelTo() {
        Line line  = new Line(0,0,1,1);
        Line line2  = new Line(1,1,2,2);
        Line line3  = new Line(1,1,2,3);
        assertEquals(true,line.parallelTo(line2));
        assertEquals(false,line.parallelTo(line3));
    }
}