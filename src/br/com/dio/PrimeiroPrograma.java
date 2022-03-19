package br.com.dio;

import br.com.dio.model.Cachorro;


public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ();
		Livros livro = new Livros();	 
       		
		System.out.println(cachorro);
		System.out.println(livro);
		
		
		
		/* int a=5;
		int b=3;
		System.out.println("Marina Linda! " + (a+b)); */

	}

}

class Livros {
	private String nome;
	private String npag;
}