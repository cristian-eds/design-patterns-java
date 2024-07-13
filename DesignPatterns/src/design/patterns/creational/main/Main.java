package design.patterns.creational.main;

import design.patterns.creational.factory_method.Plano;
import design.patterns.creational.factory_method.PlanoFactory;
import design.patterns.creational.factory_method.PlanoFactoryMethod;

public class Main {

	public static void main(String[] args) {
		
		PlanoFactoryMethod planoFactory = new PlanoFactory();
		
		Plano plano1 = planoFactory.getPlano("Basico");
		Plano plano2 = planoFactory.getPlano("Intermediario");
		Plano plano3 = planoFactory.getPlano("Profissional");
		
		plano1.calcularValorTotalMensalComUsuarios(5);
		plano2.calcularValorTotalMensalComUsuarios(5);
		plano3.calcularValorTotalMensalComUsuarios(5);

	}

}
