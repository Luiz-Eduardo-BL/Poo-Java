public class LivroDeBiblioteca {
  Livro livroDeBiblioteca = new Livro();

  String disponibilidade;
  int dataDevolucao;

  void iniciaLivroDeBiblioteca(String availability, int dateReturn){
    disponibilidade = availability;
    dataDevolucao = dateReturn;
  }

  boolean verificaBiblioteca(String availability, int dateReturn){
    if(disponibilidade != "" && dataDevolucao > 0){
      return true;
    }
    return false;
  }

  void mostrarBiblioteca(){
    if(verificaBiblioteca(disponibilidade, dataDevolucao) == true){
      System.out.println(disponibilidade + "\nData de devolucao: " + dataDevolucao);
    }else{
      System.out.println("\nNao é livro de Biblioteca!!");
    }
  }

}
