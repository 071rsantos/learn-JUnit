package com.rs7workspace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {


    @Test
    void verificarUser(){
        Assumptions.assumeFalse("Rodri".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }


}
