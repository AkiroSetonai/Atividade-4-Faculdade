package modelo;

public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
