public class Hora {
  byte horas; 
  byte minuto;
  byte segundo;

  void inicializaHora(byte h, byte m, byte s){
    if(validaHora(h, m, s)) {
      horas = h;
      minuto = m;
      segundo = s;
    }
  }
  //verifica se a hora é valida ou nao utilizando o sistema de 24 horas e nao o de 12 ou am/pm
  boolean validaHora(byte h, byte m, byte s) {
    if(h >= 0 && h <= 24 && m >= 0 && m <= 60 && s >= 0 && s <= 60){
      return true;
    }else{
      return false;
    }
  }

  void mostraHora(){
    if(validaHora(horas, minuto, segundo) == true){
      System.out.println(horas + ":" + minuto + ":" + segundo);
    }else{
      System.out.println("Hora Invalida!!!");
    }
  }
}