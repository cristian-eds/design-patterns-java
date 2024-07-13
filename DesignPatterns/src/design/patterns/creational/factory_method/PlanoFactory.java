package design.patterns.creational.factory_method;

public class PlanoFactory extends PlanoFactoryMethod{

	@Override
	public Plano getPlano(String tipoPlano) {
		if(tipoPlano.isEmpty()) {
			return null;
		}
		if(tipoPlano.equalsIgnoreCase("BASICO")) {
			return new PlanoBasico();
		} else if (tipoPlano.equalsIgnoreCase("INTERMEDIARIO")) {
			return new PlanoIntermediario();
		} else if (tipoPlano.equalsIgnoreCase("PROFISSIONAL")) {
			return new PlanoProfissional();
		}
		return null;
	}

}
