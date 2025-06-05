public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        Celular meuCelular = new Celular("Samsung Galaxy", 128);
        Livro meuLivro = new Livro("O Hobbit", "J.R.R. Tolkien", 310);

        meuCarro.exibirInfo();
        meuCarro.acelerar(50);
        meuCarro.frear();

        meuCelular.ligar();
        meuCelular.desligar();

        meuLivro.exibirDetalhes();
    }
}