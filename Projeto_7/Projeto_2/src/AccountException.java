//excessão lançada em quaisquer erros relacionados à conta
class AccountException extends RuntimeException {
  public AccountException(String message) {
      super(message);
  }
}