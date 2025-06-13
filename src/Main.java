public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogo.adicionarLivro("Memórias Póstumas", "Machado de Assis", 1881);
        catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

        System.out.println("📚 Livros por Machado de Assis:");
        for (Livro livro : catalogo.pesquisarPorAutor("Machado de Assis")) {
            System.out.println(livro);
        }

        System.out.println("\n📅 Livros entre 1800 e 1900:");
        for (Livro livro : catalogo.pesquisarPorIntervaloAnos(1800, 1900)) {
            System.out.println(livro);
        }

        System.out.println("\n🔎 Pesquisa por título 'O Hobbit':");
        Livro resultado = catalogo.pesquisarPorTitulo("O Hobbit");
        System.out.println(resultado != null ? resultado : "Livro não encontrado.");
    }
}
