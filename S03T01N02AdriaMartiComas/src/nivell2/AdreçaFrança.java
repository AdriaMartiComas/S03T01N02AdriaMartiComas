package nivell2;

public class AdreçaFrança implements Contacte {
	private String adreça;

	@Override
	public void afegirContacte(String info) {
		this.adreça = info;
	}

	@Override
	public String toString() {
		return "AdreçaFrança " + adreça;
	}

}
