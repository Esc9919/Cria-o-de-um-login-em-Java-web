package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidades.Comentario;
import Entidades.Post;

public class ProgramaAula151 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Faca uma boa viagem!");
		Comentario c2 = new Comentario("Uau, isso e incrivel!");
		Post p1 =  new Post(sdf.parse("21/06/2018 13:05:44"),
				"Viagem a Nova Zelandia",
				"Vou visitar este pais maravilhoso!",
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a forca esteja com voce!");
		Post p2 =  new Post(sdf.parse("28/07/2018 23:14:19"),
				"Boa noite pessoal",
				"Vejo voces amanha!",
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
