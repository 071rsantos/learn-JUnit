package com.rs7workspace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // organizando por ordm numerica
//@TestMethodOrder(MethodOrderer.MethodName.class) // ordem alfabetica do nome do metodo
//@TestMethodOrder(MethodOrderer.Random.class) // ordem aleatoria
@TestMethodOrder(MethodOrderer.DisplayName.class) // ordem alfabetica pegando o display name (Forma mais usual.)
public class OrdenandoTestes {

    //@Order(3)
    @DisplayName("A")
    @Test
    void ordenaFluxoA(){
        Assertions.assertTrue(true);
    }

    //@Order(2)
    @DisplayName("B")
    @Test
    void ordenaFluxoB(){
        Assertions.assertTrue(true);
    }

    //@Order(1)
    @DisplayName("C")
    @Test
    void ordenaFluxoC(){
        Assertions.assertTrue(true);
    }

}
