package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// apenas um cópia do sdf para a aplicação inteira. Não fica instantiando um novo sdf toda hora
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	// não se usar lista no construtores
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Post () {
		
	}

	public Post(Date momento, String titulo, String conteudo, Integer likes) {
		super();
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	/* Não se usa metodos set para coleções. Se usa metodo add e remove
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	*/ 
	public void adicionarComentario (Comentario comentario) {
		this.comentarios.add(comentario);
	}
	
	public void removerComentario (Comentario comentario) {
		this.comentarios.remove(comentario);
	}
	
	// Se usa o String Builder quase a String é muito grande
	// se usar somente concatenações vai ficar muito lento (usar muita memória) na hora de instanciar a String na tela
	// Classe StringBuilder é muito mais otimizada
	public String toString() {
		
		StringBuilder post = new StringBuilder();
		
		post.append("Título: " + this.titulo + "\n");
		post.append(this.likes + " Likes\n");
		post.append("Postado em: " + sdf.format(this.momento) + "\n");
		post.append(this.conteudo + "\n");
		post.append("Comentários:\n");
		for (int i=0 ; i < comentarios.size() ; i++) {
			post.append("\t" + comentarios.get(i).getTexto() + "\n");
		}
		
		return post.toString();
		
		
	}
	

}
