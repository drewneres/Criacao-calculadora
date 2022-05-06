package drew.com;

import drew.com.mod.Gato;

public class primeproj {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livros {
	private String nome;
	private String npag;
}