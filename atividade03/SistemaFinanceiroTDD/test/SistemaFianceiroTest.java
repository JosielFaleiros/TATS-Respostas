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
 * @author JosielFaleiros
 */
public class SistemaFianceiroTest {
    
    public SistemaFianceiroTest() {
    }
    
    @Test
    public void testeFaixaAte1000reais() {
        Cliente c = new Cliente("nome", 20, 1000.0, 700.0);
        SistemaFinanceiro sist = new SistemaFinanceiro();
        ArrayList<Proposta> propostas = sist.gerarPropostas(c);
        assertEquals(2, propostas.size());
        Proposta p1 = propostas.get(0);
        assertEquals(2 * 1000.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(2 * 1000.0/2, p1.getValorParcela(), 0.0000001);

        Proposta p2 = propostas.get(1);
        assertEquals(2 * 1000.0, p2.getValorTotal(), 0.0000001);
        assertEquals(3, p2.getNumeroDeParcelas());
        assertEquals(2 * 1000.0/3, p2.getValorParcela(), 0.0000001);
    }
    
    @Test
    public void testeFaixaDe1001Ate5000reais() {
        Cliente c = new Cliente("nome", 20, 1000, 3000.0);
        SistemaFinanceiro sist = new SistemaFinanceiro();
        ArrayList<Proposta> propostas = sist.gerarPropostas(c);
        assertEquals(3, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(1.3 * 1000.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(1.3 * 1000.0/2, p1.getValorParcela(), 0.0000001);
        
        Proposta p2 = propostas.get(1);
        assertEquals(1.5 * 1000.0, p2.getValorTotal(), 0.0000001);
        assertEquals(4, p2.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.0/4, p2.getValorParcela(), 0.0000001);
        
        Proposta p3 = propostas.get(2);
        assertEquals(1.5 * 1000.0, p3.getValorTotal(), 0.0000001);
        assertEquals(10, p3.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.0/10, p3.getValorParcela(), 0.0000001);
    }

    @Test
    public void testeFaixaAcimaDe5000() {
        Cliente c = new Cliente("nome", 20, 100, 7000.0);
        SistemaFinanceiro sist = new SistemaFinanceiro();

        ArrayList<Proposta> propostas = sist.gerarPropostas(c);

        Proposta p1 = propostas.get(0);
        assertEquals(1.1 * 100.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(1.1 * 100.0/2, p1.getValorParcela(), 0.0000001);

        Proposta p2 = propostas.get(1);
        assertEquals(1.3 * 100.0, p2.getValorTotal(), 0.0000001);
        assertEquals(4, p2.getNumeroDeParcelas());
        assertEquals(1.3 * 100.0/4, p2.getValorParcela(), 0.0000001);

        Proposta p3 = propostas.get(2);
        assertEquals(1.3 * 100.0, p3.getValorTotal(), 0.0000001);
        assertEquals(10, p3.getNumeroDeParcelas());
        assertEquals(1.3 * 100.0/10, p3.getValorParcela(), 0.0000001);

        Proposta p4 = propostas.get(3);
        assertEquals(1.4 * 100.0, p4.getValorTotal(), 0.0000001);
        assertEquals(20, p4.getNumeroDeParcelas());
        assertEquals(1.4 * 100.0/20, p4.getValorParcela(), 0.0000001);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
