package nivell2;

public class FactoryProducer {
	public static AbstractFactory getFactory(String tipusContacte) {
		if (tipusContacte.equalsIgnoreCase("tel")) {
			return new TelFactory();
		} else {
			return new AdreçaFactory();
		}
	}

}
