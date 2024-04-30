package ExemploConta;


public class TesteConta {

    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(0);
        c.depositar(0);
        System.out.println("Saldo= " + c.saldo);
    }

}
