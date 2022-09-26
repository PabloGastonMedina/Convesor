package OpcionesConversor;

import javax.swing.JOptionPane;

public class ConversionKilometraje {

	public void ConvertirMetroAKilometro(double valor) {
		double medida = valor / 1000;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "m equivale a: " + medida + "km");
	}
	public void ConvertirMetroACentimetro(double valor) {
		double medida = valor * 100 ;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null,  valor + "m equivale a: " + medida + "cm");
	}
	public void ConvertirMetroAMilimetro(double valor) {
		double medida = valor * 1000 ;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "m equivale a: " + medida + "mm");
	}
	public void ConvertirMetroAMilla(double valor) {
		double medida = valor / 1609 ;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "m equivale a: " + medida + "mi");
	}
	public void ConvertirKilometroAMetro(double valor) {
		double medida = valor * 1000 ;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "km equivale a: " + medida + "m");
	}
	public void ConvertirCentrimetroAMetro(double valor) {
		double medida = valor / 100;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "cm equivale a: " + medida + "m");
	}
	public void ConvertirMilimetroAMetro(double valor) {
		double medida = valor / 1000;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "mm equivale a: " + medida + "m");
	}
	public void ConvertirMillaAMetro(double valor) {
		double medida = valor * 1609;
		medida = (double) Math.round(medida*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "mi equivale a: " + medida + "m");
	}
	
}
