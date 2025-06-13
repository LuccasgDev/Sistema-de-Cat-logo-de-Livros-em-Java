import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro books = new Livro(autor, titulo, anoPublicacao);
		livros.add(books);
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		
		List<Livro> encontrados = new ArrayList<>();
		for(Livro i : livros) {
			if (i.getNOME_AUTOR().equalsIgnoreCase(autor)){
				encontrados.add(i);
			}
			
		}
		return encontrados;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> encontrados = new ArrayList<Livro>();
		for(Livro i : livros) {
			if(i.getANO() >= anoInicial && i.getANO() <= anoFinal) {
				encontrados.add(i);
			}
		}
		
		return encontrados;
	}
	
	
	public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTITULO().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
	
	
}
