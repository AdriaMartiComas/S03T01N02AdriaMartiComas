package nivell2;

public class AdreçaEspanya implements Contacte {
	private String adreça;

	@Override
	public void afegirContacte(String info) {
		this.adreça = info;

	}

	@Override
	public String toString() {
		return "AdreçaEspanya " + adreça;
	}

}
