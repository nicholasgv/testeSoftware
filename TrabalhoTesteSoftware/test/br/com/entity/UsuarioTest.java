/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class UsuarioTest {
    
    public String usrnomeRef = "Teste de software";
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testUsrnome() {
        String usrnome = "Teste d";
        Usuario instance = new Usuario();
        instance.setUsrnome(usrnome);
        System.out.println(usrnome);
        assertSame(usrnomeRef, usrnome);
//        assertEquals("Não são iguais", usrnomeRef, usrnome);
    }

    
}
