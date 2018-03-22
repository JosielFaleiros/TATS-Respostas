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
    
    @Test
    public void salarioMenor3000Desenvolvedor() {
        assertEquals(10, calculadora.calcDesconto(new Funcionario("DESENVOLVEDOR", 1000.00)));
    }
    
    @Test
    public void salarioMaiorIgual2000DBA() {
        assertEquals(25, calculadora.calcDesconto(new Funcionario("DBA", 2000.00)));
    }
    
    @Test
    public void salarioMenor2000DBA() {
        assertEquals(15, calculadora.calcDesconto(new Funcionario("DBA", 1000.00)));
    }
    
    @Test
    public void salarioMaiorIgual2000Testador() {
        assertEquals(25, calculadora.calcDesconto(new Funcionario("TESTADOR", 2000.00)));
    }
    
    @Test
    public void salarioMenor2000Testador() {
        assertEquals(15, calculadora.calcDesconto(new Funcionario("TESTADOR", 1000.00)));
    }
    
    @Test
    public void salarioMaiorIgual5000Gerente() {
        assertEquals(30, calculadora.calcDesconto(new Funcionario("GERENTE", 5000.00)));
    }
    
    @Test
    public void salarioMenor5000Gerente() {
        assertEquals(20, calculadora.calcDesconto(new Funcionario("GERENTE", 4000.00)));
    }
    
    @Test
    public void salarioDesenvolvedor() {
        assertEquals(4000.0, calculadora.calcSalario(new Funcionario("DESENVOLVEDOR", 5000.00)), 0.0000001);
    }

}
