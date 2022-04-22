package aula09;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//métodos
	public String detalhes() {
		return "Titulo= " + this.getTitulo() + "\nAutor= "  + this.getAutor() + "\nTotal de páginas= " + this.getTotPaginas() +
				"\nPágina atual= " + this.pagAtual + "\nAberto= " + this.getAberto() + "\nLeitor= " + this.getLeitor().getNome() + "\n";
	}
	
	//métodos especiais
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return this.autor;
	}
	
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getTotPaginas() {
		return this.totPaginas;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public int getPagAtual() {
		return this.pagAtual;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	public Pessoa getLeitor() {
		return this.leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		if(p > this.getTotPaginas()) {
			this.setPagAtual(this.getTotPaginas());
		}
		else {
			this.setPagAtual(p);
		}
	}

	@Override
	public void avancarPag() {
		if(this.getPagAtual()+1 > this.getTotPaginas()) {
			this.setPagAtual(this.getTotPaginas());
		}
		else {
			this.setPagAtual(this.getPagAtual()+1);
		}
	}

	@Override
	public void voltarPag() {
		if(this.getPagAtual()-1 < 0) {
			this.setPagAtual(0);
		}
		else {
			this.setPagAtual(this.getPagAtual()-1);
		}
	}
}
