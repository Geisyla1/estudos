package orientacaoObjeto.test;

import orientacaoObjeto.INTRODUCAOMETODOS.dominio.Funcionarios;

public class funcionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.idade = 24;
        funcionarios.nome = "geisyla";
        funcionarios.salarios = new double[]{1200,932.23,400};
        funcionarios.dadosFuncionarios();

    }
}
