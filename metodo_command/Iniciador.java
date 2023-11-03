public class Iniciador {
    private Comando comando;
    public void setComando(Comando comando){
        this.comando = comando;
    }
    public void conductor(){
        comando.ejecutar();
    }
}