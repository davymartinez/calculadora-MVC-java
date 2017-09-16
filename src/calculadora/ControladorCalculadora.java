package calculadora;

// El Controlador coordina las interacciones entre la Vista y el Modelo

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora {
	
	public VistaCalculadora laVista;
	public ModeloCalculadora elModelo;
	
	public ControladorCalculadora(VistaCalculadora laVista, ModeloCalculadora elModelo) {
		
		this.laVista = laVista;
		this.elModelo = elModelo;
		
		// Le indicamos a la Vista que cada vez que el botón de calcular sea clicado ejecute el método 
		// actionPerformed() en la clase interna CalcularListener
		
		this.laVista.cargarCalcularListener(new CalcularListener());;
		
	}
	
	class CalcularListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			int primerNro, segundoNro = 0;
			
			// Encerramos las interacciones con la Vista dentro de un try en caso de que los números no hayan sido
			// ingresados correctamente
			
			try {
				
				primerNro = laVista.getPrimerNro();
				segundoNro = laVista.getSegundoNro();
				
				elModelo.sumarDosNumeros(primerNro, segundoNro);
				
				laVista.setCalcSolucion(elModelo.getValorCalculo());
				
			} catch(NumberFormatException ex) {
				
				System.out.println(ex);
				
				laVista.mostrarMsjError("Error: ingresa dos (2) numeros enteros.");
				
			}
			
		}
	
	}		

}
