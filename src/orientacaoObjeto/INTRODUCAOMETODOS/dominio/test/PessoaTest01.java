package orientacaoObjeto.INTRODUCAOMETODOS.dominio.test;

import orientacaoObjeto.INTRODUCAOMETODOS.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(26);
        pessoa.setNome("Geisyla");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
