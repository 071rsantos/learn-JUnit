package com.rs7workspace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

public class ConditionalsTest {

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Rodrigo")
    void validar(){
        Assertions.assertEquals(10, 5+5);
    }


}
