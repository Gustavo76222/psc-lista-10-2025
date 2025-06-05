public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}