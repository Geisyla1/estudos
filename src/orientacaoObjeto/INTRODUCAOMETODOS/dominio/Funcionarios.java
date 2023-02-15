package orientacaoObjeto.INTRODUCAOMETODOS.dominio;

public class Funcionarios {
    public double[] salarios;//3 salarios devem ser aguardados
    public String nome;
    public int idade;

    //crie dois metodos para imprimir os dados
    //para tirar a média dos sálarios e imprimir o resultado

    public void dadosFuncionarios(){
        System.out.println(this.idade);
        System.out.println(this.salarios);
        System.out.println(this.nome);

        for (double salario: salarios){
            System.out.println(salario + " ");
        }
    }
    public void mediaSalario(){
        double media = 0;
        for (double salario:salarios){
            media += salario;
        }
        media /= salarios.length;
    }
}
