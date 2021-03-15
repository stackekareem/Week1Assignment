package com.weekone.assignment5.tests;

import com.weekone.assignment5.Three;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ThreeTest {

    @Test
    void getword() {
        String [] num = {"sad","wqwe","aaa","asd"};
        Three three = new Three();
        String [] result = {"aaa","asd"};
        assertEquals(Arrays.asList(result),three.getword(Arrays.asList(num)));
    }
}