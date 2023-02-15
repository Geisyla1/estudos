package bytebank.test;

import bytebank.dominio.Conta;

public class Contatest01 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 80;
        conta.desposita(50);
        System.out.println(conta.saldo);
        boolean conseguiu = conta.saca(20);
        System.out.println("Saldo em conta após chmar o metodo sacar = "+conta.saldo);
        System.out.println(conseguiu);
        System.out.println("Abaixo poderemos ver o metodo transferir");
        boolean transfere = conta.transfere(50);
        System.out.println(conta.saldo);
    }
}
