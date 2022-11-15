package entities;

public class Comentario {
	
	private String texto;
	
	public Comentario () {
		
	}

	public Comentario(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Comentário [texto = " + texto + "]";
	}
	
	
	
	

}
