package utilitarios;

public class Conversor {

	public double dolarHoje;
	public double dolar;
	public double real;
	
	
	public static double IOF = 0.06;
	
	public static double conversor(double dolar, double dolarHoje){
		return dolarHoje * dolar * (1.0 + IOF);
	}
	
}
