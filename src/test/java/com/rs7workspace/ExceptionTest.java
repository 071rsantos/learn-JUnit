package com.rs7workspace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {


    @Test
    void validarExceptions(){
        Conta contaOrigem = new Conta(12345, 0);
        Conta contaDestino = new Conta(73653, 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> 
                                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

    }


}
