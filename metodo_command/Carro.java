public class Carro {
    private String marca;
    public Carro(String marca){
        this.marca = marca;
    }
    public void encender(){
        System.out.println("El "+marca+" Esta encendido");
    }
    public void apagar(){
        System.out.println("El "+marca+" Esta apagado");
    }
}



