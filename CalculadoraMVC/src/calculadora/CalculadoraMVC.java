package calculadora;

public class CalculadoraMVC {

	public static void main(String[] args) {
		
		VistaCalculadora laVista = new VistaCalculadora();
		ModeloCalculadora elModelo = new ModeloCalculadora();
		@SuppressWarnings("unused")
		ControladorCalculadora elControlador = new ControladorCalculadora(laVista, elModelo);
		
	}

}
