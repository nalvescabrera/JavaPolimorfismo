package br.com.bytebank.banco.teste;

public class TesteStringDois {

	public static void main(String[] args) {

//		String nome = "Mario";// object literal
//		String outro = new String("Alura");// má pratica, sempre prefira a sintaxe literal
//
//		String novo = outro.replace("A", "a");
//		String novo = outro.toLowerCase();
//		System.out.println(novo);
//
//		char c = nome.charAt(3);
//		System.out.println(c);
//		int pos = nome.indexOf("rio");
//		System.out.println(pos);
//
//		String sub = nome.substring(1);
//		System.out.println(sub);
//
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}

		String frase = "Natalia;Alves;Cabrera";
		String[] outra = frase.split(";");
		for (int i = 0; i < outra.length;i++) {
			System.out.print(" " + outra[i]);
		}
		

	}

}
