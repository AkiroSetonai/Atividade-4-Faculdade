package modelo;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String modelo, int ano, double capacidadeCarga) {
        super(modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando mercadorias.");
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
}
