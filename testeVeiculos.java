import modelo.Bicicleta;
import modelo.Caminhao;
import modelo.Veiculo;
import modelo.Carro;

class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fiat Uno", 2010, 4);
        Veiculo bicicleta = new Bicicleta("Caloi", 2020, "Urbana");
        Veiculo caminhao = new Caminhao("Mercedes-Benz", 2015, 5000);

        carro.mover();      // Saída: O carro está acelerando na estrada.
        bicicleta.mover();  // Saída: A bicicleta está sendo pedalada pela ciclovia.
        caminhao.mover();   // Saída: O caminhão está transportando mercadorias.
    }
}
