/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kbig
 */
public class ControladoraTest {
    
    public ControladoraTest() {
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
    public void dadosValidosTest() {
        Cliente cliente = new Cliente("nome", 20, 200, 1500);
        Controlador controlador = new Controlador();
        ArrayList<Proposta> propostas = controlador.processar(cliente);
        assertEquals(3, propostas.size());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void dadosInvalidosTest() {
        Cliente cliente = new Cliente("", 20, 200, 1500);
        Controlador controlador = new Controlador();
        controlador.processar(cliente);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
