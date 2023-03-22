package com.mycompany.practica_31;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dani
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteixCorrecte() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "odnuM aloH";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);              
    }
    
    @Test
    public void testInverteixError() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "OdnuM aloH";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);               
    }
    
    @Test
    public void testInverteixNull() {
        System.out.println("inverteix");
        String cadena = null;
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.        
    }
        
    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 5;
        int month = 5;
        int year = 2004;
        int expResult = 18;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testEdatMajor() {
        System.out.println("edat");
        int day = 14;
        int month = 3;
        int year = 1754;
        int expResult = -1;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);        
    }

    @Test
    public void testEdatDadesIncorrectes() {
        System.out.println("edat");
         int day = 567;
        int month = 456;
        int year = 3009;
        int expResult = -2;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 5;
        int expResult = 120;
        int result = MyUtils.factorial(numero);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testFactorialFailed() {
        System.out.println("factorial");
        int numero = 12;
        int expResult = 120;
        int result = MyUtils.factorial(numero);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testFactorialZero() {
        System.out.println("factorial");
        int numero = 0;
        int expResult = 1;
        int result = MyUtils.factorial(numero);
        assertEquals(expResult, result,0);        
    }       
    
}
