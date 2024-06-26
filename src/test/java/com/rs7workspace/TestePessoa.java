package com.rs7workspace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestePessoa {


    @Test
    void verificarIdade(){
        Pessoa rodrigo = new Pessoa("Rodrigo", 21);
        Assertions.assertTrue(rodrigo.ehMaior());
    }

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa rodrigo = new Pessoa("Rodrigo", 21);
        Assertions.assertEquals(2003, rodrigo.calculaAnoNascimeto());
    }


}
