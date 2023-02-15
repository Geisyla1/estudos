package bytebank.dominio;

public class Conta {
    public double saldo;
    public int numero;
    public int agencia;
    public String titular;

    public void desposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor) {
        if (saldo > valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}