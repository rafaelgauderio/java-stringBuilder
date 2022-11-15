package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
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
		comentarios.add(comentario);
	}
	
	public void removerComentario (Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	

}
