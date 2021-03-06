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
            case "TESTADOR":
                desconto = descontoTestador(funcionario);
                break;
            case "GERENTE":
                desconto = descontoGerente(funcionario);
                break;
        }
        return desconto;
    }

    private int descontoGerente(Funcionario funcionario) {
        if (funcionario.getSalario() >= 5000.0) {
            return 30;
        }
        return 20;
    }

    private int descontoTestador(Funcionario funcionario) {
        if (funcionario.getSalario() >= 2000.00) {
            return 25;
        }
        return 15;
    }

    private int descontoDBA(Funcionario funcionario) {
        if (funcionario.getSalario() >= 2000.0) {
            return 25;
        }
        return 15;
    }

    private int descontoDesenvolvedor(Funcionario funcionario) {
        if (funcionario.getSalario() >= 3000.0) {
            return 20;
        }
        return 10;
    }

    public double calcSalario(Funcionario funcionario) {
        return funcionario.salario - funcionario.salario * this.calcDesconto(funcionario) / 100;
    }

}
