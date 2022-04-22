package aula09;

public class Livro {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//métodos
	public String detalhes() {
		return "Livro{" + "titulo= " + this.getTitulo() + ", autor= "  + this.getAutor() + ", Total de páginas= " + this.getTotPaginas() +
				", Página atual= " + this.pagAtual + ", aberto= " + this.getAberto() + ", leitor= " + this.getLeitor() + '}';
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
}
