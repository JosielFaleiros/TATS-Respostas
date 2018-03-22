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
                if (funcionario.getSalario() >= 3000.0) {
                    desconto = 20;
                } else {
                    desconto = 10;
                }
                break;
            case "DBA":
                if (funcionario.getSalario() >= 2000.0) {
                    desconto = 25;
                }
                break;
        }
        return desconto;
    }

}
