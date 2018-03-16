/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ClienteValidadorTest {
    
    public ClienteValidadorTest() {
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
    
     @Test(expected = IllegalArgumentException.class)
    public void TesteNomeVazio () {
        Cliente c = new Cliente("", 20, 100, 7000);
        ClienteValidador.Validar(c);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TesteSalarioMenorQueZero () {
        Cliente c = new Cliente("Joselito", 20, 100, -20);
        ClienteValidador.Validar(c);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TesteIdadeIncorreta () {
        Cliente c = new Cliente("Joselito", 10, 100, 7000);
        ClienteValidador.Validar(c);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TesteValorDeFinanciamentoIncorreto () {
        Cliente c = new Cliente("Joselito", 20, 90, 7000);
        ClienteValidador.Validar(c);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
