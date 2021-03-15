package com.weekone.assignment5.tests;

import com.weekone.assignment5.OddEven;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {

    @Test
    void addPrefix() {
        String [] num = {"1","2","3","4"};
        OddEven e = new OddEven();
        String [] result = {"o1","e2","o3","e4"};
        assertEquals(Arrays.asList(result),e.addPrefix(Arrays.asList(num)));
    }
}