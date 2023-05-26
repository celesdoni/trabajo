/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Fran Crespo Crespo
 */
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
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
