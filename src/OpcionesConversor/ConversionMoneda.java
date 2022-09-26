package OpcionesConversor;

import javax.swing.JOptionPane;

public class ConversionMoneda {

	public void ConvertirPesosArgenitnosADolares(double valor) {
		double monedaDolar = valor / 144.36;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Dolares");
	}
	public void ConvertirPesosArgenitnosAEuro(double valor) {
		double monedaDolar = valor / 144.90 ;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Euros");
	}
	public void ConvertirPesosArgenitnosALibras(double valor) {
		double monedaDolar = valor / 165.08 ;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Libras");
	}
	public void ConvertirPesosArgenitnosAYen(double valor) {
		double monedaDolar = valor / 1.01 ;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Yen");
	}
	public void ConvertirPesosArgenitnosAWonCoreano(double valor) {
		double monedaDolar = valor / 0.10 ;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Won Coreano");
	}
	public void ConvertirDolarAPesosArgentinos(double valor) {
		double monedaDolar = valor / 0.00692712662;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Pesos Argentinos");
	}
	public void ConvertirEuroAPesosArgentinos(double valor) {
		double monedaDolar = valor / 0.00690131124 ;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Pesos Argentinos");
	}
	public void ConvertirLibrasAPesosArgentinos(double valor) {
		double monedaDolar = valor / 0.006057669 ;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Pesos Argentinos");
	}
	public void ConvertirYenAPesosArgentinos(double valor) {
		double monedaDolar = valor / 0.99;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Pesos Argentinos");
	}
	public void ConvertirWonCoreanoAPesosArgentinos(double valor) {
		double monedaDolar = valor / 10;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Pesos Argentinos");
	}

}
