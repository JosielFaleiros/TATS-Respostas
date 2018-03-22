/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasalariotdd;

/**
 *
 * @author JosielFaleiros
 */
public class CalculadoraSalarioTDD {

    public int calcDesconto(Funcionario funcionario) {
        int desconto = 0;
        switch (funcionario.getPapel()) {
            case "DESENVOLVEDOR":
                desconto = descontoDesenvolvedor(funcionario);
                break;
            case "DBA":
                desconto = descontoDBA(funcionario);
                break;
        }
        return desconto;
    }

    private int descontoDBA(Funcionario funcionario) {
        if (funcionario.getSalario() >= 2000.0) {
            return 25;
        }
        return 0;
    }

    private int descontoDesenvolvedor(Funcionario funcionario) {
        if (funcionario.getSalario() >= 3000.0) {
            return 20;
        } else {
            return 10;
        }
    }

}
