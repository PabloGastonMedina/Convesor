package OpcionesConversor;

import javax.swing.JOptionPane;

public class ElegirOpcionKilometraje {

public void ConvertirMetro(double valor){
		
		ConversionKilometraje convertir = new ConversionKilometraje(); 
		
	String opcionesDeMedidas = JOptionPane.showInputDialog(null, "Elije que desea convertir", "Conversor de Kilometraje", JOptionPane.PLAIN_MESSAGE, null,
			new Object[] {"De metro a kilometro", "De metro a centimetro", "De metro a milimetro", "De metro a milla", 
					      "De kilometro a metro","De centimetro a metro", "De milimetro a metro", "De milla a metro"}, "Por favor seleccione una").toString(); 

	switch(opcionesDeMedidas) {
	case "De metro a kilometro": convertir.ConvertirMetroAKilometro(valor);
	break;
	case "De metro a centimetro": convertir.ConvertirMetroACentimetro(valor);
	break;
	case "De metro a milimetro": convertir.ConvertirMetroAMilimetro(valor);
	break;
	case "De metro a milla": convertir.ConvertirMetroAMilla(valor);
	break;
	case "De kilometro a metro": convertir.ConvertirKilometroAMetro(valor);
	break;
	case "De centimetro a metro": convertir.ConvertirCentrimetroAMetro(valor);
	break;
	case "De milimetro a metro": convertir.ConvertirMilimetroAMetro(valor);
	break;
	case "De milla a metro": convertir.ConvertirMillaAMetro(valor);
	break;
	
	
	}
	}
}
