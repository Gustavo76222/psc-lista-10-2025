public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // Inicialmente parado
    }

    public void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println("O carro acelerou para " + velocidade + " km/h.");
    }

    public void frear() {
        velocidade = 0;
        System.out.println("O carro parou.");
    }

    public void exibirInfo() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
    }
}