
package br.com.controle;
public class Calculos {
    private double valor;
    private double valor2;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public double somar(){
        return this.valor+this.valor2;
    }
    public double subtrair(){
        return this.valor-this.valor2;
    
    }
    public double multiplicar(){
        return this.valor*this.valor2;
}
    
      public double dividir(){
        return this.valor/this.valor2;
}
}

