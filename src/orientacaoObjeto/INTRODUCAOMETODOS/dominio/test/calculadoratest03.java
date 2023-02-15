package orientacaoObjeto.INTRODUCAOMETODOS.dominio.test;

import orientacaoObjeto.INTRODUCAOMETODOS.dominio.Calculadora;

public class calculadoratest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNUmeros(20,10);
        System.out.println(result);
    }
}
