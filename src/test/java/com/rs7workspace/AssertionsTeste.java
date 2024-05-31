package com.rs7workspace;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamento(){

        int [] primeiroLancamento = {10, 20, 30, 40, 50};
        int [] segundoLancamento = {-1, 5, 10, 16, 17};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); // valida se os valores do array sao iguais

        assertNotEquals(primeiroLancamento, segundoLancamento); // valida se valores sao diferentes

    }


    @Test
    void validarSeNulo(){
        Pessoa pessoa = null;

        //Assertions.assertNotNull(pessoa); // verifica se NAO é nulo
        assertNull(pessoa); // verifica se valor é nulo
    }

}
