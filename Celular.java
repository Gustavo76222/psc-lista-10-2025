public class Celular {
    private String modelo;
    private int armazenamento;
    private boolean ligado;

    public Celular(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Celular ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Celular desligado.");
    }
}