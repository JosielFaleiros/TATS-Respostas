/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosielFaleiros
 */
class ClienteValidador {

    static void Validar(Cliente c) throws IllegalArgumentException {
        if (c.getNome().trim().equals("")) {
            throw new IllegalArgumentException("Nome em branco");
        }

        if (c.getSalario() < 0) {
            throw new IllegalArgumentException("Salario negativo");
        }

        if (c.getIdade() < 18 || c.getIdade() > 70) {
            throw new IllegalArgumentException("Idade incorreta");
        }

        if (c.getEmprestimo() < 100 || c.getEmprestimo() > 100000) {
            throw new IllegalArgumentException("Valor do emprestimo invalido");
        }
    }
}
