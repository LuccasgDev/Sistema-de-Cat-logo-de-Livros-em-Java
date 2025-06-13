
public class Livro {

	private String NOME_AUTOR;
	private String TITULO;
	private int ANO;
	
	public Livro(String NOME_AUTOR, String TITULO, int ANO) {
		this.NOME_AUTOR = NOME_AUTOR;
		this.ANO = ANO;
		this.TITULO = TITULO;
	}

	public String getNOME_AUTOR() {
		return NOME_AUTOR;
	}

	public void setNOME_AUTOR(String nOME_AUTOR) {
		NOME_AUTOR = nOME_AUTOR;
	}

	public String getTITULO() {
		return TITULO;
	}

	public void setTITULO(String tITULO) {
		TITULO = tITULO;
	}

	public int getANO() {
		return ANO;
	}

	public void setANO(int aNO) {
		ANO = aNO;
	}
	
	
}
