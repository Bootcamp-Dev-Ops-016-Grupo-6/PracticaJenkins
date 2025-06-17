package com.equipo.saludo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testSaludo() {
        assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
    }
}
