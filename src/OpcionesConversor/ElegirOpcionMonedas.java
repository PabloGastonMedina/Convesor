package OpcionesConversor;

import javax.swing.JOptionPane;

public class ElegirOpcionMonedas {

	public void ConvertirPesos(double valor){
		
		ConversionMoneda convertir = new ConversionMoneda(); 
		
	String opcionesDeMonedas = JOptionPane.showInputDialog(null, "Elije que desea convertir", "Conversor monedas", JOptionPane.PLAIN_MESSAGE, null,
			new Object[] {"De pesos Argentinos a Dolares", "De pesos Argentinos a Euros", "De pesos Argentinos a Libras", "De pesos Argentinos a Yen", "De pesos Argentinos a Won Coreano",
					      "De Dolares a Pesos Argentinos","De Euros a Pesos Argentinos", "De Libras a Pesos Argentinos", "De Yen a Pesos Argentinos","De Won Coreano a Pesos Argentinos"}, "Por favor seleccione una").toString(); 

	switch(opcionesDeMonedas) {
	case "De pesos Argentinos a Dolares": convertir.ConvertirPesosArgenitnosADolares(valor);
	break;
	case "De pesos Argentinos a Euros": convertir.ConvertirPesosArgenitnosAEuro(valor);
	break;
	case "De pesos Argentinos a Libras": convertir.ConvertirPesosArgenitnosALibras(valor);
	break;
	case "De pesos Argentinos a Yen": convertir.ConvertirPesosArgenitnosAYen(valor);
	break;
	case "De pesos Argentinos a Won Coreano": convertir.ConvertirPesosArgenitnosAWonCoreano(valor);
	break;
	case "De Dolares a Pesos Argentinos": convertir.ConvertirDolarAPesosArgentinos(valor);
	break;
	case "De Euros a Pesos Argentinos": convertir.ConvertirEuroAPesosArgentinos(valor);
	break;
	case "De Libras a Pesos Argentinos": convertir.ConvertirLibrasAPesosArgentinos(valor);
	break;
	case "De Yen a Pesos Argentinos": convertir.ConvertirYenAPesosArgentinos(valor);
	break;
	case "De Won Coreano a Pesos Argentinos": convertir.ConvertirWonCoreanoAPesosArgentinos(valor);
	break;
	
	}
	}
}
