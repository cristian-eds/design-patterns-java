package design.patterns.creational.factory_method;

public abstract class Plano {
	
	protected double taxa;
	protected double mensal;
	
	public void calcularValorTotalMensalComUsuarios(int usuarios) {
		System.out.println("Valor Total Calculado: R$ " + ((usuarios*taxa)+mensal));
	}
}
