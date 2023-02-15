package orientacaoObjeto.INTRODUCAOMETODOS.dominio.test;

import orientacaoObjeto.INTRODUCAOMETODOS.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 2;
        int num2 = 35;
        calculadora.alteraDoisNUmeros(num1,num2);
        System.out.println("dentro da classe");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
