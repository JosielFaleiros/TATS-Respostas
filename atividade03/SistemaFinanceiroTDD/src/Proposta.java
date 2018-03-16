/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosielFaleiros
 */
class Proposta {
    
    double valorTotal, valorParcela;
    int numeroDeParcelas;

    Proposta(double salario, double valorEmprestimo, int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
        this.valorTotal = salario * valorEmprestimo;
        this.valorParcela = this.valorTotal / numeroDeParcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
    
}
