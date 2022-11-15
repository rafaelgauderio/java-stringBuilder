package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Comentario com1 = new Comentario ("Que notícia mais boa.");
		Comentario com2 = new Comentario ("Que venha com muita saúde.");
		Comentario com3 = new Comentario ("Tomara que puxe a beleza da mãe.");
		
		SimpleDateFormat formatoData = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post();
		post1.setTitulo("Vou ser papai.");
		post1.setLikes(15);
		post1.setConteudo("Estou muito feliz. Descobri hoje que minha esposa está grávida de 2 meses.");
		try {
			post1.setMomento(formatoData.parse("15/12/2021 12:30:00"));
		} catch (ParseException e) {
			System.out.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
		post1.adicionarComentario(com1);
		post1.adicionarComentario(com2);
		post1.adicionarComentario(com3);
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		
		System.out.println("\n" + post1);
		
		
		System.out.println("*************\n");
		
		Comentario com4 = new Comentario ("Faça boa viagem");
		Comentario com5 = new Comentario ("Paris é linda. Aproveite");
		Date data2 = null;
		try {
			data2 = formatoData.parse("17/12/2020 15:40:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Post post2 = new Post(data2, "Estou para Paris", "Minha empresa "
				+ "me presentitou com uma viajem para Paris com tudo pago e 2 acompanhantes.", 9);
		
		post2.adicionarComentario(com4);
		post2.adicionarComentario(com5);
		
		System.out.println(post2);		
		
		

	}

}
