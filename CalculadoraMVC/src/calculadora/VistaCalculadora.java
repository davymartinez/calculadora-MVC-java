package calculadora;

// Esta es la Vista, su único trabajo es mostrar lo que el usuario ve
// No ejecuta ningún cálculo, sino que solamente pasa la información ingresada por el usuario a quien la necesite

import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VistaCalculadora extends JFrame {
	
	private JTextField primerNro = new JTextField(10);
	private JLabel simboloSuma = new JLabel("+");
	private JTextField segundoNro = new JTextField(10);
	private JButton botonCalcular = new JButton("Calcular");
	private JTextField calcSolucion = new JTextField(10);
	
	VistaCalculadora() {
		
		// Configura la vista y añade los componentes
		
		JPanel panelCalculadora = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 600);
		
		panelCalculadora.add(primerNro);
		panelCalculadora.add(segundoNro);
		panelCalculadora.add(simboloSuma);
		panelCalculadora.add(botonCalcular);
		panelCalculadora.add(calcSolucion);
		calcSolucion.setEditable(false);
		
		this.add(panelCalculadora);
		this.setVisible(true);
		
		// Fin de configuración de componentes
		
	}
	
	// Bloque de getters/setters para proveer acceso a los valores de números (getters), así como para establecer
	// la solución del cálculo realizado (setter), ya que la vista "no sabe" sobre la existencia del modelo
	
	public int getPrimerNro() {

		return Integer.parseInt(primerNro.getText()); // getText() retorna el valor en el JTextField

	}

	public int getSegundoNro() {

		return Integer.parseInt(segundoNro.getText());

	}

	public int getCalcSolucion() {
		
		return Integer.parseInt(calcSolucion.getText());
		
	}

	public void setCalcSolucion(int solucion) {
		
		calcSolucion.setText(Integer.toString(solucion));; // Convertimos el entero solucion a una cadena de texto
		
	}

	// Si se hace clic sobre botonCalcular se ejecuta un método en el controlador llamado actionPerformed()
	
	public void cargarCalcularListener(ActionListener escucharBotonCalcular) {
		
		botonCalcular.addActionListener(escucharBotonCalcular);
		
	}
	
	// Abrimos una ventana popup que contiene el mensaje de error pasado como argumento
	
	public void mostrarMsjError(String msjError) {
		
		JOptionPane.showMessageDialog(this, msjError);
		
	}

}
