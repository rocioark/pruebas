package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testSumar(){
        assertEquals(App.sumar(7,1), 13);
    }
 }
