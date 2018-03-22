package calculadorasalariotdd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosielFaleiros
 */
public class Funcionario {
    String papel;
    double salario;
    public Funcionario(String papel, double salario) {
        this.papel = papel;
        this.salario = salario;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
