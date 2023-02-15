package orientacaoObjeto.INTRODUCAOMETODOS.dominio;

public class Calculadora {
    public void SomaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void SubtraiDoisNumerrros() {
        System.out.println(20 - 2);
    }

    public void MultiplicaDoisNUmeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNUmeros(double num1, double num2) {
        return num1 / num2;
    }

    //criar método
    public void alteraDoisNUmeros(int num1, int num2) {
        num1 = 99;
        num2 = 25;
        System.out.println("dentro do metodo");
        System.out.println("numero1 = " + num1);
        System.out.println("numero2 = " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma+=num;
        }
        System.out.println(soma);
    }

}