package calculadora;

// Este Modelo contiene los datos y ejecuta todos los cálculos necesarios, ni siquiera sabe que la Vista existe.

public class ModeloCalculadora {
	
	// Guarda el valor de la suma de los números ingresados en la vista.
	
	private int valorCalculo;
	
	// Ejecuta el método necesario para la suma
	
	public void sumarDosNumeros(int primerNro, int segundoNro) {
		
		valorCalculo = primerNro + segundoNro;
		
	}
	
	// getter
	public int getValorCalculo() {
		
		// Proporciona acceso a los datos
		
		return valorCalculo;
		
	}

}
