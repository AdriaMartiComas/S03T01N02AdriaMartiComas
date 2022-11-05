package nivell2;

public class AdreçaFactory extends AbstractFactory {

	@Override
	Contacte getContacte(String tipusContacte) {
		if (tipusContacte.equalsIgnoreCase("Espanya")) {

			return new AdreçaEspanya();
		} else if (tipusContacte.equalsIgnoreCase("França")) {
			return new AdreçaFrança();
		}

		return null;
	}

}
