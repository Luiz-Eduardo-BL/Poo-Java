import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Livro livros = new Livro();
        LivroDeLivraria livrosDeLivrarias = new LivroDeLivraria();
        LivroDeBiblioteca livrosDeBiblioteca = new LivroDeBiblioteca();

        System.out.println("\n--Nome--Genero--Tipo--Registro--Paginas--Preco--");
        livros.iniciaLivro(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextDouble());

        sc.nextLine();

        System.out.println("\n--Editora--Autor--Avaliação--");
        livrosDeLivrarias.iniciaLivraria(sc.nextLine(), sc.nextLine(), sc.nextLine());

        System.out.println("\n--Disponibilidade--Data-de-Devolucao--");
        livrosDeBiblioteca.iniciaLivroDeBiblioteca(sc.nextLine(), sc.nextInt());

        System.out.println("\n-----------Sobre Os Livros-------------\n");
        livros.mostrarLivro();
        livrosDeLivrarias.mostraLivraria();
        livrosDeBiblioteca.mostrarBiblioteca();
    }
}