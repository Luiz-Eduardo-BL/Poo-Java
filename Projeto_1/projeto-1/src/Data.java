public class Data {
  byte dia;
  byte mes;
  short ano;

  void inicializaData(byte d, byte m, short a){
    if(validaData(d, m, a)){
      dia = d;
      mes = m;
      ano = a;
    }
  }

  //casos para cada mes do ano, com cada caso sendo um mes e o mes 2, tendo uma verificação a mais para ver se é bisexto ou nao
  boolean validaData(byte d, byte m, short a){
    switch(m){
      case 1:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
          }
      case 2:
          if((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)){ //Verifica se é bisexto ou nao
            if(d <= 29){ 
              return true;
            }else{
              return false;
            }
          }else if(d >= 1 && d <= 28){
            return true;
          }else{
            return false;
          }
      case 3:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
          }
      case 4:
          if(d >= 1 && d <= 30){
            return true;
          } 
          else{
            return false;
          }
      case 5:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
          }
      case 6:
          if(d >= 1 && d <= 30){
            return true;
          } 
          else{
            return false;
          }
      case 7:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
          }
      case 8:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
        }
      case 9:
          if(d >= 1 && d <= 30){
            return true;
          } 
          else{
            return false;
          }
      case 10:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
          }
      case 11:
          if(d >= 1 && d <= 30){
            return true;
          } 
          else{
            return false;
          }
      case 12:
          if(d >= 1 && d <= 31){
            return true;
          } 
          else{
            return false;
          }
    }
    return false;
  }

  void mostraData(){
    if(validaData(dia, mes, ano) == true){
      System.out.printf("%02d/%02d/%d\n", dia, mes, ano);
    }else{
      System.out.println("Data Invalida!");
    }
  }
}