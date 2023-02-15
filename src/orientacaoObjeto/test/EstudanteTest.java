package orientacaoObjeto.test;

import orientacaoObjeto.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 26;
        estudante.nome = "Geisyla";
        estudante.sexo = 'F';
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}
