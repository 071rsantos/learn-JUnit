package com.rs7workspace;

import java.util.logging.Logger;

public class ControllerDB {

    private static final Logger LOGGER = Logger.getLogger(ControllerDB.class.getName()); // Logger oferece niveis diferentes de importancia para mensagem que quer passar.
    public static void iniciarConn(){
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConn(){
        //fezAlgo
        LOGGER.info("Conexao finalizazda");
    }


    public static void inserirDados(Pessoa pessoa){
        // metd. add pessoa
        LOGGER.info("Dados inseridos");
    }

    public static void remover(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }

}
