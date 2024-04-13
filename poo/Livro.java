package poo;

public class Livro {
	
		String nome;
		String descricao;
		double valor;
		String isbn;
		Autor autor;
		
		public Livro() {
			System.out.println("Novo livro cadastrado!");
		}
		
		void mostrarDetalhes() {
			System.out.println("Mostrando detalhes do livro: ");
			System.out.println(nome);
			System.out.println(descricao);
			System.out.println(valor);
			System.out.println("Valor com desconto:" + aplicarDescontoDe(0.1));
			System.out.println(isbn);
			System.out.println("--");
			this.autor.mostrarDetalhes();

		}
		
		boolean temAutor(){
			boolean naoNulo = this.autor != null;
			return naoNulo;
		}
		double aplicarDescontoDe(double percentual){
			return this.valor -= this.valor*percentual;
		}
}