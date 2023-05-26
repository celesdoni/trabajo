public class Calculadora {
  private int resultado;
  
  public Calculadora() {
    resultado(0);
  }
  
  public int sumar(int numero,int numero2) {
    resultado(numero + numero2);
    return resultado1();
  }
  
  public int restar(int numero, int numero2) {
    resultado(numero - numero2);
    return resultado1();
  }
  
  public int getResultado() {
    return resultado1();
  }

private int resultado1() {
	return resultado;
}

private void resultado(int resultado) {
	this.resultado = resultado;
}
}
