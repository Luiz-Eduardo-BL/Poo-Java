public class DataHora {
  Data novaData = new Data();
  Hora hora = new Hora();
  
  //chama o metodo mostrar data e mostrar hora, que ja fazem a verificação se sao validas ou nao
  void mostraDataHora(){
    novaData.mostraData();
    hora.mostraHora();
  }
}
