public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota");
        Encendido encendido = new Encendido(carro);
        Apagado apagar = new Apagado(carro);
        Iniciador chofer = new Iniciador();
        chofer.setComando(encendido);
        chofer.conductor();
        chofer.setComando(apagar);
        chofer.conductor();
    }
}
