public class Apagado implements Comando {
    private Carro carro;
    public Apagado(Carro carro){
        this.carro = carro;
    }
    public void ejecutar(){
        carro.apagar();
    }
}
