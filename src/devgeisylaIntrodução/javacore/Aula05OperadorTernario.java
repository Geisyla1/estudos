package devgeisylaIntrodução.javacore;
public class Aula05OperadorTernario {
    public static void main(String[] args) {
        int idade  = 16;
        String vota = "VOcê pode votar";
        String NaoVota = "Você não pode votar";
        String resultado = idade > 16 ? vota : NaoVota;
        System.out.println(resultado);
    }
}