package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testeSoma() {
        App app = new App();
        assertEquals(4, app.soma(2, 2));
    }
    
    @Test
    void testeSomaZero() {
        App app = new App();
        assertEquals(1, app.soma(0, 0));
    }

    @Test
    void testeSomaNegativos() {
        App app = new App();
        assertEquals(-5, app.soma(-2, -3));
    }
}