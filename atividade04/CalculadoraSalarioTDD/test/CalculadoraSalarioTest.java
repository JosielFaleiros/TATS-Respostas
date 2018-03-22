/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadorasalariotdd.CalculadoraSalarioTDD;
import calculadorasalariotdd.Funcionario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JosielFaleiros
 */
public class CalculadoraSalarioTest {
    private CalculadoraSalarioTDD calculadora;
    public CalculadoraSalarioTest() {
        calculadora = new CalculadoraSalarioTDD();
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
    public void salarioMaiorIgual3000Desenvolvedor() {
        assertEquals(20, calculadora.calcDesconto(new Funcionario("DESENVOLVEDOR", 3000.00)));
    }

}
