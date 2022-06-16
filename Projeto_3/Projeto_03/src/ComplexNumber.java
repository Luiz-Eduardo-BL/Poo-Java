public class ComplexNumber {

  private double real;
  private double imaginary;

  public ComplexNumber(double d, double e) {
    real = d;
    imaginary = e;
  }
  public boolean equals(ComplexNumber value) {
    if(value.real == real && value.imaginary == imaginary){
      return true;
    }
    return false; 
  }
  public ComplexNumber sum(ComplexNumber value) {
    ComplexNumber result = new ComplexNumber(0.0, 0.0);
    result.real = (real + value.real);
    result.imaginary = (imaginary + value.imaginary);

    return result;
  }
  public ComplexNumber subtract(ComplexNumber value) {
    ComplexNumber result = new ComplexNumber(0.0, 0.0);
    result.real = (real - value.real);
    result.imaginary = (imaginary - value.imaginary);

    return result;
  }
  public ComplexNumber multiply(ComplexNumber value){
    ComplexNumber result = new ComplexNumber(0.0, 0.0);
    result.real = ((real * value.real) - (imaginary * value.imaginary));
    result.imaginary = ((real * value.imaginary) + (imaginary * value.real));

    return result;
  }
  public ComplexNumber divide(ComplexNumber value) {
    ComplexNumber result = new ComplexNumber(0.0, 0.0);
    result.real = (((real * value.real) + (imaginary * value.imaginary)) / (Math.pow(value.real, 2) + Math.pow(value.imaginary, 2)));
    result.imaginary = (((imaginary * value.real) - (real * value.imaginary)) / (Math.pow(value.real, 2) + Math.pow(value.imaginary, 2)));

    return result;
  }

  @Override
  public String toString() {
    return String.format("(%.2f + %.2fi)", real, imaginary);
  }

  //Metodos Gets
  public double getReal() {
    return real;
  }
  public double getImaginary() {
    return imaginary;
  }

  //Metodos Sets
  public void setReal(double real) {
    this.real = real;
  }
  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

}