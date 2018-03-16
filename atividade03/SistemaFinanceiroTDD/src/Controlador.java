
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosielFaleiros
 */
class Controlador {

    ArrayList<Proposta> processar(Cliente cliente) {
        ClienteValidador.Validar(cliente);
        SistemaFinanceiro sistema = new SistemaFinanceiro();
        return sistema.gerarPropostas(cliente);
    }
    
}
