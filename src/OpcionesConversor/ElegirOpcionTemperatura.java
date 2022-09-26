package OpcionesConversor;

import javax.swing.JOptionPane;

public class ElegirOpcionTemperatura {

public void ConvertirTemperatura(double valor){
		
		ConversionTemperatura convertir = new ConversionTemperatura(); 
		
	String opcionesDeTemperatura = JOptionPane.showInputDialog(null, "Elije que desea convertir", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, null,
			new Object[] {"De ºCelcius a Kelvin", "De ºCelcius A ºFarenheit", "De Kelvin A ºCelcius", 
					      "De Kelvin A ºFarenheit","De ºFarenheit A ºCelcius", "De ºFarenheit A Kelvin"}, "Por favor seleccione una").toString(); 

	switch(opcionesDeTemperatura) {
	case "De ºCelcius a Kelvin": convertir.ConvertirDeCelciusAKelvin(valor);
	break;
	case "De ºCelcius A ºFarenheit": convertir.ConvertirDeCelciusAFarenheit(valor);
	break;
	case "De Kelvin A ºCelcius": convertir.convertirDeKelvinACelcius(valor);
	break;
	case "De Kelvin A ºFarenheit": convertir.convertirDeKelvinAFarenheit(valor);
	break;
	case "De ºFarenheit A ºCelcius": convertir.ConvertirDeFarenheitACelcius(valor);
	break;
	case "De ºFarenheit A Kelvin": convertir.ConvertirDeFarenheitAKelvin(valor);
	break;
	}
	}
}
