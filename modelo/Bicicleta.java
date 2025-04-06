package modelo;

public class Bicicleta extends Veiculo {
    private String tipo;

    public Bicicleta(String modelo, int ano, String tipo) {
        super(modelo, ano);
        this.tipo = tipo;
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada pela ciclovia.");
    }

    public String getTipo() {
        return tipo;
    }
}
