public class Livro {
  String nome;
  String genero; 
  String tipo; //Se sera de biblioteca ou de livraria
  int registro; //Numero de registro do numero
  int paginas;
  double preco;

  public void iniciaLivro(String name, String tipe, String gender, int register, int pag, double price){
    nome = name;
    genero = gender;
    tipo = tipe;
    registro = register;
    paginas = pag;
    preco = price;
  }
  
  public boolean validaLivro(String name, String tipe, String gender, int register, int pag, double price){
    if(register >= 0 && pag >= 0 && price >= 0.0 && name != "" && tipe != "" && gender != ""){
      return true;
    }
    return false;
  }

  public void mostrarLivro(){
    if(validaLivro(nome, tipo, genero, registro, paginas, preco)== true){
      System.out.println("Nome: " + nome + "\nGenero: " + genero + "\nTipo: " + tipo + "\n");
      System.out.println("Registro: " + registro + "\nPagina: " + paginas + "\nPreco: " + preco);
    }
  }
}
