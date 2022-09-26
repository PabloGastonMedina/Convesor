package principal;


import javax.swing.JOptionPane;

import OpcionesConversor.ElegirOpcionKilometraje;
import OpcionesConversor.ElegirOpcionMonedas;
import OpcionesConversor.ElegirOpcionTemperatura;



public class Principal {


	public static void main(String[] args) {
		
		ElegirOpcionMonedas convirtiendoMonedas = new ElegirOpcionMonedas();
		ElegirOpcionKilometraje convirtiendoKilometraje = new ElegirOpcionKilometraje();
		ElegirOpcionTemperatura convirtiendoTemperatura = new ElegirOpcionTemperatura();
		
		

		
		JOptionPane.showMessageDialog(null, "Hola, sea Bienvenido a Conversor Alura");
		while (true) {
		
		
		String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",JOptionPane.PLAIN_MESSAGE,null,
				new Object[] {"Conversor de monedas", "Conversor de medidas", "Conversor de temperaturas"}, "Elige").toString();
		
		
		
		switch(opciones){
		case "Conversor de monedas":
			String inputDinero = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			double valorRecibidoDinero = Double.parseDouble(inputDinero);
			convirtiendoMonedas.ConvertirPesos(valorRecibidoDinero);
			break;
		case "Conversor de medidas":
			String inputKilometraje = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			double valorRecibidoKilometraje = Double.parseDouble(inputKilometraje);
            convirtiendoKilometraje.ConvertirMetro(valorRecibidoKilometraje);
            break;
	    case "Conversor de temperaturas":
	    	String inputTemperatura = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			double valorRecibidoTemperatura = Double.parseDouble(inputTemperatura);
			convirtiendoTemperatura.ConvertirTemperatura(valorRecibidoTemperatura);
			break;
			
		}
		
		
		int terminarOSeguir = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
		if (JOptionPane.OK_OPTION == terminarOSeguir) {
			System.out.println("");
		}else {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			break;
		}
		
	}
		
		
  }
}
