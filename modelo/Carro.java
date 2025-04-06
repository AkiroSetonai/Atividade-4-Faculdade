package modelo;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String modelo, int ano, int numPortas) {
        super(modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void mover() {
        System.out.println("O carro está acelerando na estrada.");
    }

    public int getNumPortas() {
        return numPortas;
    }
}
