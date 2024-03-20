package org.king.plataformaConsumer5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {    
    @Test
    void testGreetPlataformaConsumer3() {
        org.king.plataformaConsumer3.Library library = new org.king.plataformaConsumer3.Library();
        String result = library.greet("plataforma-consumer-5");
        assertEquals("greet from plataforma-consumer-3 plataforma-consumer-5", result);
    }
    @Test
    void testGreetPlataformaConsumer4() {
        org.king.plataformaConsumer4.Library library = new org.king.plataformaConsumer4.Library();
        String result = library.greet("plataforma-consumer-5");
        assertEquals("greet from plataforma-consumer-4 plataforma-consumer-5", result);
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("plataforma-consumer-5");
        assertEquals("greet from plataforma-consumer-5 plataforma-consumer-5", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();
        String result = library.greet1("plataforma-consumer-5");
        assertEquals("greet1 from plataforma-consumer-5 via plataforma greet1 greet1 from plataforma greet from libdep1, plataforma-consumer-5", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("plataforma-consumer-5");
        assertEquals("greet2 from plataforma-consumer-5 via plataforma greet2 greet2 from plataforma greet from libdep2, plataforma-consumer-5", result);
    }
    @Test
    void testGreet3() {
        Library library = new Library();
        String result = library.greet3("plataforma-consumer-5");
        assertEquals("greet3 from plataforma-consumer-5 via plataforma greet3 greet3 from plataforma greet from libdep3, plataforma-consumer-5", result);
    }
    @Test
    void testGreet4() {
        Library library = new Library();
        String result = library.greet4("plataforma-consumer-5");
        assertEquals("greet4 from plataforma-consumer-5 via plataforma greet4 greet4 from plataforma greet from libdep4, plataforma-consumer-5", result);
    }
    @Test
    void testGreet5() {
        Library library = new Library();
        String result = library.greet5("plataforma-consumer-5");
        assertEquals("greet5 from plataforma-consumer-5 via plataforma greet5 greet5 from plataforma greet from libdep5, plataforma-consumer-5", result);
    }
    @Test
    void testGreet6() {
        Library library = new Library();
        String result = library.greet6("plataforma-consumer-5");
        assertEquals("greet6 from plataforma-consumer-5 greet1 from libdep4, plataforma-consumer-5", result);
    }
}
