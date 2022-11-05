package nivell2;

public class TelFactory extends AbstractFactory {
	private String tel;

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	Contacte getContacte(String tipusContacte) {
		if (tipusContacte.equalsIgnoreCase("Espanya")) {
			return new TelEspanya();
		} else if (tipusContacte.equalsIgnoreCase("França")) {
			return new TelFrança();
		}

		return null;
	}

}
