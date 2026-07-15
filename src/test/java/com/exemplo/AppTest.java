package com.exemplo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testeSoma(){

        App app = new App();

        assertEquals(4, app.soma(2,2));

    }

}