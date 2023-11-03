public class Encendido implements Comando {
    private Carro carro;
    public Encendido(Carro carro){
        this.carro = carro;
    }
    public void ejecutar(){
        carro.encender();
    }
}
