
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
class SistemaFinanceiro {

    ArrayList<Proposta> gerarPropostas(Cliente c) {
        ArrayList<Proposta> propostas = new ArrayList<>();
        if (c.getSalario() <= 1000) {
            gerarPropostasParaFaixa1(propostas, c.getEmprestimo());
        } else if (c.getSalario() <= 5000) {
            gerarPropostasParaFaixa2(propostas, c.getEmprestimo());
        } else {
            gerarPropostasParaFaixa3(propostas, c.getEmprestimo());
        }
        return propostas;
    }

    public void gerarPropostasParaFaixa3(ArrayList<Proposta> propostas, double emprestimo) {
        propostas.add(new Proposta(1.1, emprestimo, 2));
        propostas.add(new Proposta(1.3, emprestimo, 4));
        propostas.add(new Proposta(1.3, emprestimo, 10));
        propostas.add(new Proposta(1.4, emprestimo, 20));
    }

    public void gerarPropostasParaFaixa2(ArrayList<Proposta> propostas, double emprestimo) {
        propostas.add(new Proposta(1.3, emprestimo, 2));
        propostas.add(new Proposta(1.5, emprestimo, 4));
        propostas.add(new Proposta(1.5, emprestimo, 10));
    }

    public void gerarPropostasParaFaixa1(ArrayList<Proposta> propostas, double emprestimo) {
        propostas.add(new Proposta(2, emprestimo, 2));
        propostas.add(new Proposta(2, emprestimo, 3));
    }
    
}
