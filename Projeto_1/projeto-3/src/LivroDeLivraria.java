public class LivroDeLivraria {
  Livro livroDeLivraria = new Livro();

  String editora;
  String autor;
  String avaliacao;

  void iniciaLivraria(String publishingCompany, String author, String assessment){
    editora = publishingCompany;
    autor = author;
    avaliacao = assessment;
  }
  
  boolean verificaLivraria(String publishingCompany, String author, String assessment){
    if(publishingCompany == "" && author == "" && assessment == ""){
      return false;
    }
    return true;
  }

  void mostraLivraria(){
    if(verificaLivraria(editora, autor, avaliacao) == true){
      // livroDeLivraria.mostrarLivro();
      System.out.println("\nEditora: " + editora + "\nAutor: " + autor + "\nAvaliacao: " + avaliacao);
    }else if(verificaLivraria(editora, autor, avaliacao) == false){
      System.out.println("\nNao é livro de Livraria!!");
    }
  }
}
