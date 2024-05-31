package com.rs7workspace;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosTeste {

    @BeforeAll //antes de tudo, faça:
    static void configuraConexao(){
        ControllerDB.iniciarConn();
    }

    @BeforeEach
    void inserirParaTeste(){
        ControllerDB.inserirDados(new Pessoa("Rodrigo", 21));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterEach
    void removerTeste(){
        ControllerDB.remover(new Pessoa("Rodrigo", 21));
    }

    @AfterAll // depois de tudo, faça:
    static void finalizarConexao(){
        ControllerDB.finalizarConn();
    }

}
