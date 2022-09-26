package OpcionesConversor;

import javax.swing.JOptionPane;

public class ConversionTemperatura {

	public void ConvertirDeCelciusAKelvin(double valor) {
		double temperatura = valor + 273.15;
		temperatura = (double) Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°C equivale a: " + temperatura + "K");
	}
	public void ConvertirDeCelciusAFarenheit(double valor) {
		double temperatura = ( valor * (1.8) ) + 32;
		temperatura = (double) Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null,  valor + "°C equivale a: " + temperatura + "°F");
	}
	public void convertirDeKelvinACelcius(double valor) {
		double temperatura = valor - 273.15;
		temperatura = (double) Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "K equivale a: " + temperatura + "°C");
	}
	public void convertirDeKelvinAFarenheit(double valor) {
		double temperatura = ( (valor - 273.15) * (1.8) ) + 32;
		temperatura = (double) Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "K equivale a: " + temperatura + "°F");
	}
	public void ConvertirDeFarenheitACelcius(double valor) {
		double temperatura = ( valor - 32) * (0.555555556) ;
		temperatura = (double) Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°F equivale a: " + temperatura + "°C");
	}
	public void ConvertirDeFarenheitAKelvin(double valor) {
		double temperatura = ( ( valor - 32) * 0.555555556 ) + 273.15;
		temperatura = (double) Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°F equivale a: " + temperatura + "K");
	}
	
}
